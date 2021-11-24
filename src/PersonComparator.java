import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getFirstName().compareTo(o2.getFirstName());
        if(result == 0)
        {
            result = o1.getLastName().compareTo(o2.getLastName());
            if (result == 0)
            {
                return o1.getAge() - o2.getAge();
            }
            return result;
        }
        return result;
    }

}
