package portfolio.breno.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        // Regra -> Para que o lambda funcione a interface que está sendo trabalhada deve ser funcional (ter apenas um metodo abstrato)
        // Estrutura: (param) -> expression

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        forEach(integers, s -> System.out.println(s));

    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T obj : list) {
            consumer.accept(obj);
        }
    }
}
