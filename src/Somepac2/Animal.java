package Somepac2;

import Somepac3.Food;
import Somepac3.Grace;

abstract public class Animal
{
    protected String name, color, gender, species;
    protected int weight, AP, satiety, id;
    public String getName(){return this.name;}
    public int getId(){return this.id;}
    public int getAP(){return this.AP;}
    public int getSatiety(){return this.satiety;}
    public void eat (Food a)
    {
        if (this.id != a.getFoodid())
        {
            System.out.println("Now "+ this.name+ " is offered "+ a.getFoodname());
            System.out.println(this.name + " don't eat "+ a.getFoodname());
        }
        else
        {
            this.satiety+= a.getFoodh();
            this.AP--;
            System.out.println("Now "+ this.name+ " is offered "+ a.getFoodname());
            System.out.println(this.name + " eat "+ a.getFoodname());
        }
    }
    /*static public int hungry, z;
    static protected void searchFood(ForCarnivorus a)
    {
        switch (a)
        {
            case "beef": hungry = ForCarnivorus.beef.hunrgy; z = ForCarnivorus.id; break;
            case "pork": hungry = ForCarnivorus.pork.hunrgy; z = ForCarnivorus.id; break;
            case "chicken": hungry = ForCarnivorus.chicken.hunrgy; z = ForCarnivorus.id; break;
            case "mutton": hungry = ForCarnivorus.mutton.hunrgy; z = ForCarnivorus.id; break;
            case "grace": hungry = ForHerbivore.grace.hunrgy; z = ForHerbivore.id; break;
            case "oats": hungry = ForHerbivore.oats.hunrgy; z = ForHerbivore.id; break;
            case "millet": hungry = ForHerbivore.millet.hunrgy; z = ForHerbivore.id; break;
            case "fruits": hungry = ForHerbivore.fruits.hunrgy; z = ForHerbivore.id; break;
        }
    }*/
}

