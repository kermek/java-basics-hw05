import java.util.ArrayList;
import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type
   */


  public static void feed(List<? extends Bird> list) {
    // TODO fix method declaration
    showBirds(list);

    // TODO print birds in the cycle
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

  public static void main(String... args) {
    List<Eagle> eagles = new ArrayList<>();
    eagles.add(new Eagle());
    eagles.add(new Eagle());
    eagles.toString();
    Zoo.feed(eagles);
       Zoo.showBirds(eagles);
       System.out.println("--------------------");


    List<Swallow> swallows = new ArrayList<>();
    swallows.add(new Swallow());
    swallows.toString();
    Zoo.feed(swallows);
    Zoo.showBirds(swallows);
    System.out.println("--------------------");

    List<Penguin> penguins = new ArrayList<>();
    penguins.add(new Penguin());
    penguins.toString();
    Zoo.feed(penguins);
    Zoo.showBirds(penguins);
    System.out.println("--------------------");

    List<Kiwi> kiwis = new ArrayList<>();
    kiwis.add(new Kiwi());
    kiwis.toString();
    Zoo.feed(kiwis);
    Zoo.showBirds(kiwis);
    System.out.println("--------------------");

  }
}