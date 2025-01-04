package portfolio.breno.maratonajava.javacore.Aintroducaoclasses.test;

import portfolio.breno.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Breno", 10, 'M');
        System.out.println(estudante.nome + " " + estudante.idade + " " + estudante.sexo);
    }
}
