package portfolio.breno.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private String nome;
    private int episodios;
    private String genero;

    /**
     * Sobrecarga de Metodos: Ter metodos de mesmo nome. Porém, esses metodos diferem no tipo ou na quantidade de parametros
     */
    public void init(String tipo, String nome, int episodios) {
        this.tipo = tipo;
        this.nome = nome;
        this.episodios = episodios;
    }

    public void init(String tipo, String nome, int episodios, String genero) {
        this.init(tipo, nome, episodios);
        this.genero = genero;
    }

    public void  print() {
        System.out.println("Nome: " + this.nome + "\nTipo: " + this.tipo + "\nEpisodios: " + this.episodios);
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
