package portfolio.breno.maratonajava.javacore.ZZDoptional.dominio;

public class Anime {
    private Integer id;
    private String title;
    private int episodes;

    public Anime(Integer id, String title, int episodes) {
        this.id = id;
        this.title = title;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", quantity=" + episodes +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodes() {
        return episodes;
    }
}
