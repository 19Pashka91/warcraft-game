package src.race;

public class People extends Person {


  public People(String name) {
    super("People", name, 1000, 180, 80);
  }

  @Override
  public void greet(){
    System.out.println("My blade is ready");
  }

}
