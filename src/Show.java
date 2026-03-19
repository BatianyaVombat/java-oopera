import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printListOfActors() { //печать списка актёров текущего спектакля
        System.out.println(getTitle());
        System.out.println("Актёры:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor newActor) { //добавление актёра в спектакль
        if (listOfActors.isEmpty()) {
            listOfActors.add(newActor);
        } else {
            for (Actor actor : listOfActors) {
                if (newActor.hashCode() == actor.hashCode() && newActor.equals(actor)) {
                    System.out.println("Такой актёр уже играет в спектакле!");
                    return;
                }
            }
            listOfActors.add(newActor);
        }
    }

    public void replaceActor(Actor replacement, String surname) { //замена актёра в спектакле
        if (!listOfActors.isEmpty()) {
            Actor targetActor = null;
            for (Actor actor : listOfActors) {
                if (surname.equals(actor.getSurname())){
                    targetActor = actor;
                }
            }

            if (targetActor != null){
                listOfActors.remove(targetActor);
                listOfActors.add(replacement);
            } else {
                System.out.println("Актёра " + surname + " нет в спектакле " + title + "!");
            }
        }
    }

    public String getTitle() {
        return title;
    }
}