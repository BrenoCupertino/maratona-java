package portfolio.breno.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamsTest10 {
    public static void main(String[] args) {
        Stream.iterate(0, i -> i + 1).limit(10).forEach(System.out::println);

        System.out.println();

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(arr -> System.out.println(Arrays.toString(arr)));

        System.out.println();

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(10, 1000)).limit(10).forEach(System.out::println);
    }
}
