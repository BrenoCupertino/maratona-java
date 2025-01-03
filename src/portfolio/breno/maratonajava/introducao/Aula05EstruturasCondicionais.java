package portfolio.breno.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        if(true) System.out.println("Olá");

        int age = 19;

        if (age < 15) {
            System.out.println("Não pode comprar!");
        } else if (age > 18 && age <= 20) {
            System.out.println("Pode comprar");
        } else {
            System.out.println("Não compre!");
        }

        double s = 6000;
        String d = "Doar";
        String nd = "Não doar";
        // Operador Ternario: (condição) ? verdadeiro : falso
        System.out.println(s > 5000 ? d : nd);

        // Switch
        // Tipos que pode ser utilizado: char, int, byte, short, enum, String
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("--");
                break;
            case 2:
                System.out.println("--");
                break;
            case 3:
                System.out.println("--");
                break;
            case 4:
                System.out.println("--");
                break;
            case 5:
                System.out.println("--");
                break;
            case 6:
                System.out.println("--");
                break;
            default:
                System.out.println("--");
        }
    }

}
