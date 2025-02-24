package portfolio.breno.maratonajava.javacore.Npolimorfismo.test;

import portfolio.breno.maratonajava.javacore.Npolimorfismo.repositorio.RepoDB;
import portfolio.breno.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repo = new RepoDB();
        repo.salvar();
    }
}
