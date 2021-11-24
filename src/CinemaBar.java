import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CinemaBar {

    private final Set<String> bar = new HashSet<>();
    private final Set<String> barTree = new TreeSet<>();
    Scanner sc = new Scanner(System.in);

    //dodawanie napojów
    public void addDrink() {
        System.out.println("Czego się napijesz?");
        String drink = sc.nextLine();
        bar.add(drink);
        barTree.add(drink);
    }

    // wyświetlenie napojów
    public void getDrink() {
        //wyswietla losowo
        System.out.println("-Początek listy HashSet-");
        for (String drink : bar) {
            System.out.println(drink);
        }
        System.out.println("-Koniec listy HashSet-");
        //wyswietla alfabetycznie
        System.out.println("-Początek listy TreeSet-");
        for (String drink : barTree) {
            System.out.println(drink);
        }
        System.out.println("-Koniec listy TreeSet-");
    }
}
