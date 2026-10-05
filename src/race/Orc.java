package src.race;

public class Orc extends Person {

  public Orc(String name) {
    super("Orc", name, 1100, 200, 100);
  }

  @Override
  public void greet(){
    System.out.println("We fight not for glory, but for honor");
  }

}
