package portfolio.breno.maratonajava.javacore.Zgenerics.test;

import portfolio.breno.maratonajava.javacore.Zgenerics.dominio.Carro;
import portfolio.breno.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.retrieveAvailableCar();
        System.out.println("Usando o carro...");
        carroRentavelService.returnRentalCar(carro);
    }
}
