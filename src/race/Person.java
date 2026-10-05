package src.race;

public abstract class Person {

  private String name;
  private final String race;
  private final int health;
  private final int height;
  private final int weight;

  protected Person(String race, String name, int health, int height, int weight) {
    this.race = race;
    this.name = name;
    this.health = health;
    this.height = height;
    this.weight = weight;
  }

  public abstract void greet();

  public void description(){
    greet();
    System.out.println("Name: " + name);
    System.out.println("Race: " + race);
    System.out.println("Health: " + health);
    System.out.println("Height: " + height);
    System.out.println("Weight: " + weight);
  }

}
