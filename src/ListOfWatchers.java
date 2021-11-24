import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListOfWatchers {

    private final List<Person> cinema = new ArrayList<>();   //Użyjemy Arraylisty, ponieważ lista gości wprowadzona przez użytkownika może być długa
    Scanner sc = new Scanner(System.in);
    public void addGuest() {

        System.out.println("Podaj imię gościa");
        String firstName = sc.nextLine();

        System.out.println("Podaj nazwisko gościa");
        String lastName = sc.nextLine();

        System.out.println("Podaj wiek gościa");
        int birthYear = Integer.parseInt(sc.nextLine());

        System.out.println("Podaj rodzaj biletu(podanie wartości innej niż z listy skutkuje przydzieleniem biletu normalnego");
        System.out.println("Dozwolone rodzaje biletów:" + Arrays.deepToString(TicketType.values()));
        String ticketType = sc.nextLine();

        Person person = new Person(firstName,
                lastName,
                birthYear,
                ticketType);

        cinema.add(person);

    }
    public  void getGuests()
    {
        for (Person person : cinema)      //Wyświetlanie gości dodanych wcześniej do listy
        {
            person.getPersonInfo();
        }
    }


}