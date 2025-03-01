package portfolio.breno.maratonajava.javacore.QString.test;

public class StringTest01 {

    public static void main(String[] args) {
        String n = "William"; // String constant poll -> Espaço reservado dentro do Heap para Strings.
        String n2 = "William";

        // Strings são imutaveis, ou seja, o código abaixo não altera o valor que "n" faz referencia.
        n.concat(" Souza");
        System.out.println(n);

        // Comparação por referência.
        System.out.println(n == n2);

        String n3 = new String("Willian");
        /* Falso, pois estamos alocando um espaço na HEAP para um objeto que encapsula a string que se encontra
        no poll de string.*/
        System.out.println(n3 == n2);
        System.out.println(n3.intern() == n2); // Intern() -> Retorna a string do poll de strings.
    }
}
