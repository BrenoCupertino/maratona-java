package portfolio.breno.maratonajava.javacore.Eblocoinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    /**
     *Blocos de inicialização: É um inicializador de instancia pois, é executado toda vez que uma instacia é criada.
     */

    public Anime(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
