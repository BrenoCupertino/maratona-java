package portfolio.breno.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {

        //Dado o valor de um carro descubra em quantas vezes pode ser pacrcelado
        //Condição -> valor da parcela >= 1000

        double price = 50000;
        /*for (int parcela = 1; parcela <= price; parcela++) {
            double valorParcela = price / parcela;
            if(valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " $" + valorParcela);
        }*/

        //Utilização Continue
        for (int parcela = (int) price; parcela >= 1; parcela--) {
            double valorParcela = price / parcela;
            if(valorParcela < 1000) continue;
            System.out.println("Parcela " + parcela + " $" + valorParcela);
        }
    }
}
