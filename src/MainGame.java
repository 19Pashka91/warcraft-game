package src;

import src.race.*;

public class MainGame {

  public static void main(String[] args) {
    Person human = new People("Arthas Menethil");
    Person elf = new Elf("Illidan Stormrage");
    Person orc = new Orc("Varok Saurfang");
    Person gnom = new Gnomes("Gelbin Mekkatorque");
    Person undead = new Undead("Sylvanas Windrunner");

    human.description();
    System.out.println();
    elf.description();
    System.out.println();
    orc.description();
    System.out.println();
    gnom.description();
    System.out.println();
    undead.description();
  }
}
