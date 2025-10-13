package portfolio.breno.maratonajava.javacore.ZZBcomportamento.test;

import portfolio.breno.maratonajava.javacore.ZZBcomportamento.Interfaces.CarPredicate;
import portfolio.breno.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {

    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("Green", 2017), new Car("Red", 2020));
        List<Car> green = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("Green");
            }
        });
        green.forEach(c -> System.out.println(c.getColor()));
    }

    //Utilização de predicados para padronizar o código
    public static List<Car> filter (List<Car> cars, CarPredicate predicate) {
        List<Car> filterdCar = new ArrayList<>();
        for (Car car : cars) {
            if (predicate.test(car)) {
                filterdCar.add(car);
            }
        }
        return filterdCar;
    }
}
