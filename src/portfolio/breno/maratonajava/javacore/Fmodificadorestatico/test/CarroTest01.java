package portfolio.breno.maratonajava.javacore.Fmodificadorestatico.test;

import portfolio.breno.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 295);
        Carro carro3 = new Carro("Audi", 300);

        Carro.setVelocidadeLimite(245);
        carro.print();
        carro2.print();
        carro3.print();

    }
}
