package Somepac2;

public class Duck extends Herbivore {
    Duck(String name, int satiety, int AP) {
        this.name = name;
        this.satiety = satiety;
        this.AP = AP;
        this.species = "Duck";
    }

    static public Duck Donald = new Duck("Donald", 5, 4);
    static public Duck Scrooge  = new Duck("Scrooge ", 5, 4);
    static public Duck Launchpad   = new Duck("Launchpad  ", 5, 4);

}
