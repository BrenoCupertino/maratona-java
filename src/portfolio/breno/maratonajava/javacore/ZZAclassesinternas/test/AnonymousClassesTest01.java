package portfolio.breno.maratonajava.javacore.ZZAclassesinternas.test;


class Animal {
    void walk() {
        System.out.println("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        // São classes que terão um breve tempo de vida em uma parte do código e não serão utilizada em nenhum outro lugar.
        Animal animal = new Animal() {
            @Override
            void walk() {
                System.out.println("Cat walking");
            }
        };
        animal.walk();
    }
}
