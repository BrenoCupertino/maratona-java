package portfolio.breno.maratonajava.javacore.Xserialization.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {
    private static final long serialVersionUID = 386918118083720511L; // um código que permite a serializaćão (automatico)
    private Long id;
    private String nome;
    private transient String password; // ignorado na serialização
    private transient Turma turma;

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ",turma=" + turma +
                '}';
    }

    // Exemplificação de como serializar o atributo de classe "Turma"
    private void writeObject(ObjectOutputStream oos) throws java.io.IOException {
        try {
            oos.defaultWriteObject(); // Salva padrão
            oos.writeUTF(turma.toString()); // Salve o nome do atributo
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private  void readObject(ObjectInputStream ois) throws java.io.IOException {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
