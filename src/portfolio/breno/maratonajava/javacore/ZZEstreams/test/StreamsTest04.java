package portfolio.breno.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamsTest04 {
    public static void main(String[] args) {
        List<List<String>> l =  new ArrayList<>();
        List<String> l1 = List.of("Ola", "Mesmo", "Outro");
        List<String> l2 = List.of("So", "Quimo", "Kalem");
        l.add(l1);
        l.add(l2);

        l.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
