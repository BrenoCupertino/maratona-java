package portfolio.breno.maratonajava.javacore.Zgenerics.service;

import portfolio.breno.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T retrieveAvailableObject() {
        System.out.println("Buscando objeto disponivel...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponiveis para alugar");
        System.out.println("    "+ objetosDisponiveis);
        return t;
    }

    public void returnRentalObject(T t) {
        System.out.println("Devolvendo carro: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println("    "+ objetosDisponiveis);
    }
}
