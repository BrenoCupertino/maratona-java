package portfolio.breno.maratonajava.javacore.Npolimorfismo.repositorio;

public class RepoDB implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados...");
    }
}
