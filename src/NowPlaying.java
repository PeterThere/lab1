import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class NowPlaying {
    Map<String, String> listOfHMovies = new HashMap<>();
    Map<String, String> listOfTMovies = new TreeMap<>();
    public void movieMap() {
        listOfHMovies.put("Dune", "Dennis Villeneuve");
        listOfHMovies.put("French Dispatch", "Wes Anderson");
        listOfHMovies.put("Last Night in Soho", "Edgar Wright");
        listOfHMovies.put("Dune", "Dennis Villeneuve"); //celowa duplikacja wpisów
        listOfHMovies.put("Eternals", "Chloé Zhao");
        listOfHMovies.put("French Dispatch", "Wes Anderson"); //celowa duplikacja wpisu

        listOfTMovies.putAll(listOfHMovies); //wpisanie filmów do TreeMap
        //wyświetlenie map
        System.out.println("-HashMap-");
        listOfHMovies.forEach((movie,author) -> System.out.println(movie + ", " + author));
        System.out.println("-TreeMap-");
        listOfTMovies.forEach((movie,author) -> System.out.println(movie + ", " + author));
    }
}
