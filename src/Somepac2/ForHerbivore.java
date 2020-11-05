package Somepac2;

public class ForHerbivore extends Food
{
    protected static int id = 0;
    protected int getFood()
    {
        return this.hunrgy;
    }
    public ForHerbivore(String name, int hungry)
    {
        this.name = name;
        this.hunrgy = hungry;
    }
    static ForHerbivore grace = new ForHerbivore("grace", 1);
    static ForHerbivore oats = new ForHerbivore("oats", 2);
    static ForHerbivore millet = new ForHerbivore("millet", 2);
    static ForHerbivore fruits = new ForHerbivore("fruits", 1);

}
