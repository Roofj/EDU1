package Somepac2;

public class Wolf extends Carnivorous implements Growl {
    Wolf(String name, int satiety, int AP) {
        this.name = name;
        this.satiety = satiety;
        this.AP = AP;
        this.species = "Wolf";
    }

    @Override
    public void growl()
    {
        this.AP-= 1;
        System.out.println(this.name+ " growl");
    }

    static public Wolf Akela = new Wolf("Akela", 5, 4);
}
