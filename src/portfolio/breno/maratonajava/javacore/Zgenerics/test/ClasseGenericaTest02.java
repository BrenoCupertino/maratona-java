package portfolio.breno.maratonajava.javacore.Zgenerics.test;

import portfolio.breno.maratonajava.javacore.Zgenerics.dominio.Barco;
import portfolio.breno.maratonajava.javacore.Zgenerics.dominio.Carro;
import portfolio.breno.maratonajava.javacore.Zgenerics.service.CarroRentavelService;
import portfolio.breno.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("toyota"), new Carro("BMW")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.retrieveAvailableObject();
        System.out.println("Usando o carro...");
        rentalService.returnRentalObject(carro);

        System.out.println("---------------------");

        RentalService<Barco> rentalService2 = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalService2.retrieveAvailableObject();
        System.out.println("Usando o barco...");
        rentalService2.returnRentalObject(barco);
    }
}
