import java.util.HashSet;
import java.util.Set;

public class ComparisonEqHash {

    public void show() {


        System.out.println("Różnica między nadpisaniem obu metod w przeciwieństwie do nadpisania tylko equals()");

        MovieNewEqual movieA = new MovieNewEqual("French Dispatch", 2);
        MovieNewEqual movieB = new MovieNewEqual("French Dispatch", 2);


        System.out.println("\nUtworzono dwa obiekty klasy MovieNewEqual (z nadpisaną tylko metodą equals()");
        System.out.println("\n(1.)Sprawdzenie kodu (movieA.equals(movieB)):\n");

        if (movieA.equals(movieB))
            System.out.println("To są te same filmy.");
        else
            System.out.println("To nie są te same filmy.");

        System.out.println("\n(2.)Sprawdzenie co się stanie, jeśli spróbujemy wpisać dwa obiekty klasy MovieNewEqual do jednego HashSetu\n");

//        Map<MovieNewEqual, String> mapOfMovies = new HashMap<>();
//
//        mapOfMovies.put(movieA, "Dobry film");
//        mapOfMovies.put(movieB, "Zły film");
//
//        movieA.getMovieInfo();
//        System.out.println(" - " + mapOfMovies.get(movieA));
//        movieB.getMovieInfo();
//        System.out.println(" - " + mapOfMovies.get(movieB));
        Set<MovieNewEqual> movies = new HashSet<>();
        movies.add(movieA);
        movies.add(movieB);
        for (MovieNewEqual movie : movies) movie.getMovieInfo();
        System.out.println("\nBez nadpisanej metody Hashcode(), program myśli, że hashcode'y obu obiektów są różne.");

        System.out.println("\nWykonanie kroków (1.) i (2.) dla obiektów klasy MovieNewBoth (metody equals() i hashCode() zostały nadpisane)\n");

        MovieNewBoth movieC = new MovieNewBoth("Venom", 2);
        MovieNewBoth movieD = new MovieNewBoth("Venom", 2);

        if (movieC.equals(movieD))
            System.out.println("Tak, to te same filmy.");
        else
            System.out.println("Nie, to nie te same filmy.");

        //<MovieNewBoth, String> mapOfMovies1 = new HashMap<>();

        Set<MovieNewBoth> movies2 = new HashSet<>();
        movies2.add(movieC);
        movies2.add(movieD);
        for (MovieNewBoth movie : movies2) movie.getMovieInfo();
        System.out.println("\n" +
                "Z nadpisaną metodą hashCode(), program widzi, że są to te same obiekty,\n"+
                "więc obiekt został wpisany do HashMapy tylko raz.");
    }
}
