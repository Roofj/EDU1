package Somepac3;

public abstract class Food
{
    protected String name, type;
    protected int hunrgy, id;
    public int getFoodh(){return this.hunrgy;}
    public int getFoodid(){return this.id;}
    public String getFoodname(){return this.name;}
}
