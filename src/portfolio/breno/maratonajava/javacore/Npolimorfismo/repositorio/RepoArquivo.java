package portfolio.breno.maratonajava.javacore.Npolimorfismo.repositorio;

public class RepoArquivo implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando no arquivo...");
    }
}
