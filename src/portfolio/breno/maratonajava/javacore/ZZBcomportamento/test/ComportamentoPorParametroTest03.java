package portfolio.breno.maratonajava.javacore.ZZBcomportamento.test;

import portfolio.breno.maratonajava.javacore.ZZBcomportamento.Interfaces.CarPredicate;
import portfolio.breno.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {

    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("Green", 2017), new Car("Red", 2020));
        List<Car> green = filter(cars, car -> car.getYear() < 2023);
        green.forEach(c -> System.out.println(c.getColor()));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filterd =  new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                filterd.add(t);
            }
        }
        return filterd;
    }
}
