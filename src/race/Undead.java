package src.race;

public class Undead extends Person{

  public Undead(String name) {
    super("Undead", name, 1500, 180, 90);
  }

  @Override
  public void greet(){
    System.out.println("May death be merciful");
  }

}
