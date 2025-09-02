package portfolio.breno.maratonajava.javacore.Zgenerics.service;

import portfolio.breno.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco retrieveAvailableCar() {
        System.out.println("Buscando Barco disponivel...");
        Barco c = barcosDisponiveis.remove(0);
        System.out.println("Alugando Barco: " + c);
        System.out.println("barcos disponiveis para alugar");
        System.out.println("    "+ barcosDisponiveis);
        return c;
    }

    public void returnRentalCar(Barco c) {
        System.out.println("Devolvendo Barco: " + c);
        barcosDisponiveis.add(c);
        System.out.println("barcos disponiveis para alugar: ");
        System.out.println("    "+ barcosDisponiveis);
    }
}
