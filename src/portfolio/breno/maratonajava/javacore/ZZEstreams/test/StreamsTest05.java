package portfolio.breno.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest05 {
    public static void main(String[] args) {
        List<String> gomu = List.of("Gomu", "Leme", "Parse");

        List<String[]> collect = gomu.stream()
                .map(w -> w.split(""))
                .collect(Collectors.toList());

        List<String> collect1 = gomu.stream()
                .map((w) -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(collect1);
    }
}
