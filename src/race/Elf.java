package src.race;

public class Elf extends Person {

  public Elf(String name) {
    super("Elf", name, 900, 170, 70);
  }

  @Override
  public void greet(){
    System.out.println("I have done what I must to protect Azeroth");
  }

}
