package portfolio.breno.maratonajava.javacore.Npolimorfismo.repositorio;

public class RepoMemoria implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando na memoria...");
    }
}
