import java.util.ArrayList;

public class Ballet extends MusicalShow{
    protected Person choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                  Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
