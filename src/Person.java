enum TicketType {

    REGULAR("Normalny"),
    REDUCED("Ulgowy"),
    STUDENT("Student"),
    SENIOR("Senior"),
    VETERAN("Weteran");

    String ticketType;

    TicketType(String ticket_type) {
        ticketType = ticket_type;
    }

    @Override
    public String toString() {
        return ticketType;
    }
}

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;
    private TicketType ticketType;

    public Person(String first_name, String last_name, int age1, String ticket_type) {
        setFirstName(first_name);
        setLastName(last_name);
        setAge(age1);
        setTicketType(ticket_type);
    }

    public String getFirstName(){return this.firstName;}

    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public String getLastName(){return this.lastName;}

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public int getAge(){return this.age;}

    public void setAge(int age1) {
        this.age = age1;
    }

    public void setTicketType(String ticket_type) {
        if (ticket_type == null || ticket_type.equals("")) {  // pusty łańcuch znaków oznacza bilet normalny
            this.ticketType = TicketType.REGULAR;
            return;
        }
        for(TicketType ticket: TicketType.values()){
            if (ticket.ticketType.equals(ticket_type)) {
                this.ticketType = ticket;
                return;
            }
        }
        this.ticketType = TicketType.REGULAR; // domyślnym biletem jest bilet normalny
    }

    public void getPersonInfo(){

        System.out.println("Imię: " + firstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Wiek: " + age);
        System.out.println("Rodzaj biletu: " + ticketType);
        System.out.println();

    }

    @Override
    public int compareTo(Person o) {
        int result = this.firstName.compareTo(o.firstName);
        if(result == 0)
        {
            result = this.lastName.compareTo(o.lastName);
            if (result == 0)
            {
                return this.age - o.age;
            }
            return result;
        }
        return result;
    }
}
