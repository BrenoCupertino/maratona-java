package portfolio.breno.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    static {
        System.out.println("Dentro do bloco estatico!");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    /**
     *Blocos de inicialização estatico: É um inicializador de instancia executado somente uma vez..
     */

    public Anime(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
