import java.util.Scanner;

public class ConsoleUserDialog {
    public void run(){
        ListOfWatchers listOfWatchers = new ListOfWatchers();
        CinemaBar cinemaBar = new CinemaBar();
        NowPlaying nowPlaying = new NowPlaying();
        ComparisonEqHash comparisonEqHash = new ComparisonEqHash();
        ComparisonCom comparisonCom = new ComparisonCom();
        while (true) {

            System.out.println(" Wybierz opcję:");
            System.out.println("1 - Aktualna lista filmów"); //HashMap/TreeMap - wyświetlanie
            System.out.println("2 - Wpisz osobę na salę"); //ArrayList - dodawanie
            System.out.println("3 - Wyświetl listę osób na sali");  //ArrayList - wyświetlanie
            System.out.println("4 - Dodaj napój do baru kinowego"); //HashSet - dodawanie
            System.out.println("5 - Wyświetl dostępne napoje w barze kinowym"); //HashSet/TreeSet - wyświetlanie
            System.out.println("6 - equals()/Hashcode()"); //Porównanie equals()/Hashcode()
            System.out.println("7 - Comparable/Comparator"); //Porównanie Comparable/Comparator + LinkedList
            System.out.println("8 - Zakończ \n");

            Scanner i = new Scanner(System.in);

            int choice = i.nextInt();

            System.out.println();

            switch (choice) {
                case 1 -> nowPlaying.movieMap();
                case 2 -> listOfWatchers.addGuest();
                case 3 -> listOfWatchers.getGuests();
                case 4 -> cinemaBar.addDrink();
                case 5 -> cinemaBar.getDrink();
                case 6 -> comparisonEqHash.show();
                case 7 -> comparisonCom.show();
                case 8 -> System.exit(0);
                default -> System.out.println("Niestety nie mamy takiej pozycji z menu. Wybierz liczbę 1-8.\n");
            }
        }
    }
}

