package portfolio.breno.maratonajava.javacore.Bintroducaometodos.dominio;


public class Calculadora {

    /**
     *Partes de um metodo: <br>
     * <b>modificador de acesso,</b>
     * <b>retorno,</b>
     * <b>nome do metodo.</b>
     */
    public void soma(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Valores de tipo primitivo são passados para o metodo como copia
     */
    public void alteraNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 100;
        System.out.println("Dentro do metodo altera dois numeros: ");
        System.out.println("Num 1: " + num1 + "\nNum 2: " + num2);
    }

    public void imprimeDiv(double num1, double num2) {
        System.out.println(num1/num2);
    }

    /**
     * Varargs -> Tansforma o parametro em array
     */
    public void somaArrayVarArgs(int... nums) {
        int soma = 0;
        for(int num: nums) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaArray(int[] nums) {
        int soma = 0;
        for(int num: nums) {
            soma += num;
        }
        System.out.println(soma);
    }
}
