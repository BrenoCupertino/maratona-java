package portfolio.breno.maratonajava.javacore.ZZBcomportamento.test;

import portfolio.breno.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("Green", 2017), new Car("Red", 2020));
        List<Car> greenCars = FilterCarBycolor(cars, "green");
        greenCars.forEach(c -> System.out.println(c.getColor()));
        List<Car> carsBefore2025 = FilterByYearBefore(cars, 2025);
        carsBefore2025.forEach(c -> System.out.println(c.getColor()));
    }

    //Como diminuir a quantidade de código repetido?
    private static List<Car> FilterCarBycolor(List<Car> cars, String color) {
        List<Car> greenCars = new ArrayList<>();
        for(Car c : cars) {
            if(c.getColor().toLowerCase().equals(color)) {
                greenCars.add(c);
            }
        }
        return greenCars;
    }

    private static List<Car> FilterByYearBefore(List<Car> cars, int year) {
        List<Car> carsBefore = new ArrayList<>();
        for(Car c : cars) {
            if(c.getYear() < year) {
                carsBefore.add(c);
            }
        }
        return carsBefore;
    }
}
