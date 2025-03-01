package portfolio.breno.maratonajava.javacore.QString.test;

public class StringBuilder01 {

    public static void main(String[] args) {
        String nome = "Breno Silva";
        nome.concat(" Lua");
        System.out.println(nome);

        // É mutavel, ou seja, podemos alterar a String sem criar novos dados no poll de strings.
        StringBuilder n = new StringBuilder("Sol");
        n.append(" Lua").append(" Sonar");
        System.out.println(n);
        System.out.println(n.substring(0, 2));
    }
}
