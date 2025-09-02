package portfolio.breno.maratonajava.javacore.Zgenerics.test;

abstract class Animal {
    public abstract void consulta();
}

class Dog extends Animal {
    @Override
    public void consulta() {
        System.out.println("Dog consulta");
    }
}

class Cat extends Animal {
    @Override
    public void consulta() {
        System.out.println("Cat consulta");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};

        printConsulta(dogs);
        printConsulta(cats);

        Animal[] animals = {new Cat(), new Dog()};
        printConsulta(animals);
    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }

    }
}
