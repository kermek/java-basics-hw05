import java.util.ArrayList;
import java.util.List;

public class Zoo {

    ArrayList<Bird> zooBirds;

    public static void feed(List<? extends Bird> list) {
        // TODO fix method declaration
        System.out.println("Feeding birds");
        // TODO print birds in the cycle
        showBirds(list);

    }

    /**
     * Adds birds to a flying section of the zoo.
     *
     * @param list list of birds of particular type
     * @param bird new bird
     */


    public static void acceptBird(List<? super FlyingBird> flyingBird, FlyingBird bird) {
        // TODO fix method declaration
        System.out.println("Accepting bird to a section");
        // TODO check flying bird wings
        bird.checkWings();
        // TODO add bird to the list and print it
        flyingBird.add(bird);
        showBirds(flyingBird);

    }

    /**
     * Adds bird to the general list.
     *
     * @param list    list of birds
     * @param newBird bird to add
     */

    public static void registerBird(List<? super Bird> newBirds, Bird newBird) {
        // TODO fix method declaration
        System.out.println("Adding bird to the birds list");
        // TODO add bird to list
        newBirds.add(newBird);
        // TODO print birds in the cycle
        showBirds(newBirds);
    }

    public static void showBirds(List<?> bird) {
        for (Object value : bird) {
            System.out.println(value);
        }
    }
}