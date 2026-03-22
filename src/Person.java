public class Person {
    protected String name;
    protected String surname;
    protected final Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getSurname() {

        return surname;
    }

    public String getName() {
        return name;
    }
}
