package portfolio.breno.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private String nome;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime (String tipo, String nome, int episodios, String genero) {
        this.tipo = tipo;
        this.nome = nome;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String tipo, String nome, int episodios, String genero, String estudio) {
        this(tipo, nome, episodios, genero);
        this.estudio = estudio;
    }

    public void  print() {
        System.out.println("Nome: " + this.nome + "\nTipo: " + this.tipo + "\nEpisodios: " + this.episodios + "\nGenero: " + this.genero + "\nEstudio: " + this.estudio);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
