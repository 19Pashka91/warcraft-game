package src.race;

public class Gnomes extends Person {

  public Gnomes(String name) {
    super("Gnomes", name, 800, 100, 100);
  }

  @Override
  public void greet(){
    System.out.println("Let’s see if this works!");
  }
}
