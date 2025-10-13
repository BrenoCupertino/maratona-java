package portfolio.breno.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o = Optional.of("qualquer"); // Espera não nulo
        Optional<String> o2 = Optional.ofNullable(null); // Pode receber nulo
        Optional<String> o3 = Optional.empty(); // Retorna uma instancia vazia
        System.out.println(o);
        System.out.println(o2);
        System.out.println(o3);

        System.out.println("---------------------");

//        Optional<String> name = Optional.ofNullable(findName("breno"));
//        name.ifPresent(s -> System.out.println(s.toUpperCase()));

        Optional<String> name = findName("breno");
        System.out.println(name);
    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("Lucas", "Junior", "Maria");
        int i = list.indexOf(name);
        if(i >= 0) return Optional.of(list.get(i));
        return Optional.empty();
    }
}
