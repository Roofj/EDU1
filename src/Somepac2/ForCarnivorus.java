package Somepac2;

public class ForCarnivorus extends Food
{
    protected static int id = 1;
    protected int getFood()
    {
        return this.hunrgy;
    }
    public ForCarnivorus(String name, int hungry)
    {
        this.name = name;
        this.hunrgy = hungry;
    }
    static ForCarnivorus beef = new ForCarnivorus("beef", 3);
    static ForCarnivorus pork = new ForCarnivorus("pork", 3);
    static ForCarnivorus chicken = new ForCarnivorus("chicken", 2);
    static ForCarnivorus mutton = new ForCarnivorus("mutton", 3);
}
