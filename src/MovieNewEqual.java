import java.util.Objects;

public class MovieNewEqual {   //Klasa z nadpisaną metodą equals, ale bez nadpisanej metody Hashcode
    private final String title;
    private final int runtime;

    public MovieNewEqual(String title, int runtime) {
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
        MovieNewEqual movie2 = (MovieNewEqual) o;
        return runtime == movie2.runtime && Objects.equals(title, movie2.title);
    }

}
