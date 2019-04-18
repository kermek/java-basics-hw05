import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Zoo {

    ArrayList<Bird> zooBirds = new ArrayList<>();


    public static void feed(ArrayList<? extends Bird> list) {
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


    public static void acceptBird(ArrayList<? extends FlyingBird> flyingBird, FlyingBird bird) {
    // TODO fix method declaration
    System.out.println("Accepting bird to a section");
    // TODO check flying bird wings
      for (FlyingBird value : flyingBird) {
          value.checkWings();
      }
        ArrayList<FlyingBird> zooFlyingBirds = new ArrayList<>();
        // TODO add bird to the list and print it
      showBirds(flyingBird);

  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds
   * @param newBird bird to add
   */
  /*static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
      for (T o : a) {
          c.add(o); // Correct
      }
  }*/

  public static void registerBird(ArrayList<? super Bird> newBirds, Bird newBird) {
    // TODO fix method declaration
    System.out.println("Adding bird to the birds list");
    // TODO add bird to list


    // TODO print birds in the cycle
      showBirds(newBirds);
  }

    public static void showBirds(ArrayList<?> bird){
        for (Object value : bird) {
            System.out.println(value);
        }
    }

/*    public static void showList(ArrayList<? extends Machine> list){
      for (Machine value : list) {
          System.out.println(value);
      }
    }


    public static void showList(ArrayList<? super Machine> list){
      for (Machine value : list) {
          System.out.println(value);
      }
    }

    */

}