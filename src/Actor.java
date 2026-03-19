import java.util.Objects;

public class Actor extends Person{
    double height;

    public Actor(String name, String surname, Gender gender, double height){
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString(){
        return name + " " + surname + " (" + height + " м.)";
    }

    @Override
    public int hashCode() {
        int hash = 13;
        if (name != null) {
            hash = name.hashCode(); // вычисляем хеш первого поля
        }

        if (surname != null) { // проверяем значение второго поля
            hash = hash + surname.hashCode(); // вычисляем хеш второго поля и общий хеш двух полей
        }

        return hash; // возвращаем хеш
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(name, otherActor.name) &&
                Objects.equals(surname, otherActor.surname) &&
                (height == otherActor.height);
    }
}
