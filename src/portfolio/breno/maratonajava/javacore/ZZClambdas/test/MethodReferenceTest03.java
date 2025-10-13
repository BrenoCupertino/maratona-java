package portfolio.breno.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

//Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Lucas", "Breno", "Carla"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> function = Integer::parseInt;
        System.out.println(function.apply("155"));

        BiPredicate<List<String>, String> checkName =  List::contains;
        System.out.println(checkName.test(list, "Lucas"));
    }
}
