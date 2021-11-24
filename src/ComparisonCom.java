import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparisonCom {
    private final List<Person> actors = new LinkedList<>();
    public void show() {

        Person actorA = new Person("Timothée", "Chalamet", 25, "");
        Person actorB = new Person("Jason", "Statham", 54, "");
        Person actorC = new Person("Jason", "Mamoa", 42, "");
        Person actorD = new Person("Oscar", "Isaac", 42, "");

        actors.add(actorA);
        actors.add(actorB);
        actors.add(actorC);
        actors.add(actorD);

        System.out.println("\n" +
                "Użycie interfejsu Comparable, aby posortować aktorów przy użyciu metody CompareTo().");
        System.out.println("Sortowanie odbędzie się w kolejności imię>nazwisko>wiek.");
        System.out.println("Posortowane dane aktorów // CompareTo()");

        Collections.sort(actors);
        for(Person actor: actors) actor.getPersonInfo();

        System.out.println("\n" +
                "Użycie interfejsu Comparator + użycie metody reversed()");

        actors.sort(new PersonComparator().reversed());
        for(Person actor: actors) actor.getPersonInfo();

    }
}
