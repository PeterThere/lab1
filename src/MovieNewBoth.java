import java.util.Objects;

public class MovieNewBoth {  //Klasa z nadpisanymi metodami equals oraz Hashcode

    private String title;
    private int runtime;

    public MovieNewBoth(String title, int runtime) {
        this.title = title;
        this.runtime = runtime;
    }

    public void getMovieInfo(){
        System.out.println(title + " - runtime: " + runtime + " hrs");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieNewBoth movie = (MovieNewBoth) o;
        return runtime == movie.runtime && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31 * result + title.hashCode();
        result = 31 * result + runtime;
        return result;
    }
}
