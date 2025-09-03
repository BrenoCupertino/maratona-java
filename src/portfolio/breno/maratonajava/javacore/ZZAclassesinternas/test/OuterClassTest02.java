package portfolio.breno.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassTest02 {
    private String name = "Luffy";

    // Classes locais estarão dentro de um metodo ou blocos de inicialização
    void print() {
        // O atributo que utilizamos no metodo que possui a classe local é "final".
        String lastName = "Marihu";

        // Aceita apenas "Abstract e Final" como modificadores de acesso.
        class Local {
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }

        // Precisamos inicializar a classe local dentro do próprio metodo
        Local local = new Local();
        local.printLocal();
    }

    public static void main(String[] args) {
        OuterClassTest02 outerClass02 =  new OuterClassTest02();
        outerClass02.print();
    }
}
