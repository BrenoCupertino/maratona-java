package portfolio.breno.maratonajava.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {
        // Arrays são tipo reference uqe apontam para um objeto
        int[] ages = new int[3];
        ages[0] = 10;
        ages[1] = 50;
        ages[2] = 20;

        for (int i=0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        System.out.println("---------------");

        int[] numbers = {1, 2, 3};
        int[] primary = new int[]{1, 2, 5, 7};

        for (int num: numbers) {
            System.out.println(num);
        }

    }
}
