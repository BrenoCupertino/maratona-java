package portfolio.breno.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> st = List.of("Alo", "Ola", "Vida");
//        List<Integer> size = map(st, s -> s.length());

        //Utilização de method reference
        List<Integer> size = map(st, String::length);
        System.out.println(size);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T obj : list) {
            R r = function.apply(obj);
            result.add(r);
        }
        return result;
    }
}
