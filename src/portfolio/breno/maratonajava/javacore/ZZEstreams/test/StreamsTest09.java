package portfolio.breno.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest09 {
    public static void main(String[] args) throws IOException {
        IntStream.rangeClosed(1, 50).filter(i -> i % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        IntStream.range(1, 50).filter(i -> i % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("Olajkaddn", "kafjaio", "jadhaj")
                .map(String::toUpperCase)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        int[] nums = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(nums);
        stream.average().ifPresent(System.out::println);

        try(Stream<String> lines = Files.lines(Paths.get("Teste.txt"))) {
            lines.filter(line -> line.contains("Java")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
