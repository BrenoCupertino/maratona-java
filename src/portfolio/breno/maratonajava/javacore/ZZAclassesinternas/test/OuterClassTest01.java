package portfolio.breno.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassTest01 {
    private String name = "Luffy";

    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassTest01 outerClass = new OuterClassTest01();
        Inner inner = outerClass.new Inner();
        inner.printOuterClassAttribute();

        new OuterClassTest01().new Inner().printOuterClassAttribute();

    }
}
