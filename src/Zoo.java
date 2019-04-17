import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type
   */
  public static void feed(List list) {
    // TODO fix method declaration
    System.out.println("Feeding birds");
    // TODO print birds in the cycle
    list.forEach (bird -> System.out.println(bird));
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type
   * @param bird new bird
   */
  public static void acceptBird(List list, FlyingBird bird) {
    // TODO fix method declaration
    System.out.println("Accepting bird to a section");
    // TODO check flying bird wings
    bird.checkWings();
    // TODO add bird to the list and print it
    list.add(bird);
    list.forEach (item -> System.out.println(item));
  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds
   * @param newBird bird to add
   */
  public static void registerBird(List list, Bird newBird) {
    // TODO fix method declaration
    System.out.println("Adding bird to the birds list");
    // TODO add bird to list
    list.add(newBird);
    // TODO print birds in the cycle
    list.forEach (item -> System.out.println(item));
  }
}