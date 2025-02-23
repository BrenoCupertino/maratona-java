package portfolio.breno.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    Professor[] professores;

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void print() {
        System.out.println(this.nome);
        if(professores != null) {
            for(Professor p: this.professores) {
                System.out.println(p.getNome());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
