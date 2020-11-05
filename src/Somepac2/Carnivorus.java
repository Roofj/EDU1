package Somepac2;

public class Carnivorus extends Animal
{
    protected void eat (String a)
    {
        Animal.searchFood(a);
        if (Animal.z==1)
        {
            System.out.println("Now "+ this.name+ " is offered "+ a);
            System.out.println(this.name + " don't eat "+ a);
        }
        else
        {
            this.satiety+= Animal.hungry;
            this.AP--;
            System.out.println("Now "+ this.name+ " is offered "+ a);
            System.out.println(this.name + " eat "+ a);
        }
    }
    Carnivorus (String name, String species, int satiety, int AP)
    {
        this.name = name;
        this.species = species;
        this.satiety = satiety;
        this.AP = AP;
    }
    static Carnivorus Garfield = new Carnivorus("Garfield", "Cat", 5, 4);
    static Carnivorus Simba = new Carnivorus("Simba", "Lion", 5, 4);
    static Carnivorus Akela = new Carnivorus("Akela", "Wolf", 5, 4);
}
