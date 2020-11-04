public class Kotik
{
    int hungry = 5;
    int AP = 4;
    String name = new String ("Kotik");
    public void eat ()
    {
        this.hungry=+3;
        this.AP=-1;
    }
    public void play()
    {
        this.hungry=-2;
        this.AP=-1;
    }
    public void sleep()
    {
        this.hungry=-1;
        this.AP=+5;
    }
    public void walk()
    {
        this.hungry=-2;
        this.AP=-1;
    }
    public void chaseMouse()
    {
        this.hungry=-3;
        this.AP=-1;
    }
    public void dead()
    {
        System.out.println(this.name + " is dead");
    }
    public void relax()
    {
        this.hungry=-1;
        this.AP=+1;
    }
}
