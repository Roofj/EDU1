package Somepac2;

public class Herbivore extends Animal
{
    public void eat (String a)
    {
        Animal.searchFood(a);
        System.out.println(Animal.z);
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
    Herbivore (String name,String species, int satiety, int AP)
    {
        this.name = name;
        this.species = species;
        this.satiety = satiety;
        this.AP = AP;
    }
    static Herbivore Donald = new Herbivore("Donald", "Duck", 5, 4);
    static Herbivore Jerry = new Herbivore("Jerry", "Mouse", 5, 4);
    static Herbivore Marty = new Herbivore("Marty", "Zebra", 5, 4);
}
