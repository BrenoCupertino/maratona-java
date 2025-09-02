package portfolio.breno.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>(List.of(new Dog(), new Dog()));
        List<Cat> cats = new ArrayList<>(List.of(new Cat(), new Cat()));
        printConsulta(dogs);
    }

    // Recebo animal ou qualquer um que seja filho. No entanto não poderia adicionar nada a lista passada.
    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    // Recebo animal ou qualquer que seja pai.
    private static void printConsultaAnimal(List<? super Animal> animals) {
        animals.add(new Dog());
        animals.add(new Cat());
    }
}
