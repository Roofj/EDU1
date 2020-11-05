package Somepac2;

public abstract class Animal
{
    protected String name, color, gender, species;
    protected int weight, AP, satiety;
    protected abstract void eat (String a);
    static public int hungry, z;
    static protected void searchFood(String a)
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
    }
}

