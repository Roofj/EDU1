package Somepac2;

public class Wolf extends Carnivorous {
    Wolf(String name, int satiety, int AP) {
        this.name = name;
        this.satiety = satiety;
        this.AP = AP;
        this.species = "Wolf";
    }

    static public Wolf Akela = new Wolf("Akela", 5, 4);
}
