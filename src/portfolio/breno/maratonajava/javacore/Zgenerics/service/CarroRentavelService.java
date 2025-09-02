package portfolio.breno.maratonajava.javacore.Zgenerics.service;

import portfolio.breno.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("toyota"), new Carro("BMW")));

    public Carro retrieveAvailableCar() {
        System.out.println("Buscando carro disponivel...");
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando Carro: " + c);
        System.out.println("Carros disponiveis para alugar");
        System.out.println("    "+ carrosDisponiveis);
        return c;
    }

    public void returnRentalCar(Carro c) {
        System.out.println("Devolvendo carro: " + c);
        carrosDisponiveis.add(c);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println("    "+ carrosDisponiveis);
    }
}
