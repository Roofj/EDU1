package Somepac2;

public class Lion extends Carnivorous {
    Lion(String name, int satiety, int AP) {
        this.name = name;
        this.satiety = satiety;
        this.AP = AP;
        this.species = "Lion";
    }

    static public Lion Simba = new Lion("Simba", 5, 4);
    static public Lion Scar = new Lion("Scar", 5, 4);
    static public Lion Alex = new Lion("Alex", 5, 4);
}
