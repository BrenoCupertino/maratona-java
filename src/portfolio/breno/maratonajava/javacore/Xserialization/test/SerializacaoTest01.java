package portfolio.breno.maratonajava.javacore.Xserialization.test;

import portfolio.breno.maratonajava.javacore.Xserialization.dominio.Aluno;
import portfolio.breno.maratonajava.javacore.Xserialization.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Breno", "jdfd566");
        Turma turma = new Turma("Java");
        aluno.setTurma(turma);
        serializar(aluno);
        desserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/alunos.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path));) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void desserializar() {
        Path path = Paths.get("pasta/alunos.txt");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path));) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
