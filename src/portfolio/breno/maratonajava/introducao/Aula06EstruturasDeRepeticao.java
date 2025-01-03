package portfolio.breno.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        // For, while, do while
        int i = 1;
        while(i < 11) {
            System.out.println(i);
            i++;
        }

        int j = 11;
        do {
            System.out.println(j);
            j--;
        } while (j < 11 && j > 0);

        for (int a = 0; a < 10; a++) {
            System.out.println("For");
        }
    }
}
