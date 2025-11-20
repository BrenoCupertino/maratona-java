package portfolio.breno.maratonajava.javacore.ZZEstreams.test;

import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.Category;
import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        long n = 10_000_000;
        sumFor(n);
        sumStreamIterate(n);
        sumParallelStreamIterate(n);
        sumLongStreamIterate(n);
    }

    private static void sumFor(long n) {
        System.out.println("Sum For");
        long result = 0;
        long t = System.currentTimeMillis();
        for (long i = 1; i < n; i++) {
            result += i;
        }
        long f = System.currentTimeMillis();
        System.out.println(f - t);
    }

    private static void sumStreamIterate(long n) {
        System.out.println("SumStreamIterate");
        long result = 0;
        long t = System.currentTimeMillis();
        Long reduce = Stream.iterate(1L, i -> i + 1).limit(n).reduce(0L, Long::sum);
        long f = System.currentTimeMillis();
        System.out.println(f - t);
    }

    private static void sumParallelStreamIterate(long n) {
        System.out.println("SumParallelStreamIterate");
        long result = 0;
        long t = System.currentTimeMillis();
        Long reduce = Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce(0L, Long::sum);
        long f = System.currentTimeMillis();
        System.out.println(f - t);
    }

    private static void sumLongStreamIterate(long n) {
        System.out.println("sumLongStreamIterate");
        long result = 0;
        long t = System.currentTimeMillis();
        Long reduce = LongStream.rangeClosed(1L, n).parallel().reduce(0L, Long::sum);
        long f = System.currentTimeMillis();
        System.out.println(f - t);
    }
}
