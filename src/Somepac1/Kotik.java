package Somepac1;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Kotik
{
    int satiety;
    int AP;
    String name;
    public void eat (int hungry)
    {
        this.satiety+= hungry;
        this.AP--;
    }
    public void eat (int hungry, String food)
    {
        this.satiety=+ hungry;
        this.AP--;
        System.out.println(this.name + " eat " + food);
    }
    public void eat ()
    {
        eat(3,"Mouse");
    }
    public void play()
    {
        this.satiety-=2;
        this.AP--;
        System.out.println(this.name + " play");
    }
    public void sleep()
    {
        this.satiety--;
        this.AP+=5;
        System.out.println(this.name + " sleep");
    }
    public void walk()
    {
        this.satiety-=2;
        this.AP--;
        System.out.println(this.name + " walk");
    }
    public void chaseMouse()
    {
        this.satiety-=3;
        this.AP--;
        System.out.println(this.name + " chase Mouse.");
    }
    public void dead()
    {
        System.out.println(this.name + " is dead");
    }
    public void relax()
    {
        this.satiety--;
        this.AP++;
        System.out.println(this.name + " relax");
    }
    public Kotik (String name, int satiety, int AP)
    {
        this.name = name;
        this.satiety = satiety;
        this.AP = AP;
    }

    public void liveAnotherDay()
    {
        for (int n = 0; n < 24; n++)
        {
            System.out.println(n);
            if (this.satiety<=-5)
            {
                this.dead();
            }
            else
            {
                if (this.AP <0)
                {
                    this.sleep();
                }
                else
                {
                    if (this.satiety<0)
                    {
                        this.chaseMouse();
                        this.eat();
                    }
                    else
                    {
                        int a = (int) (Math.random() * 10);
                        if (a == 0 || a == 5)
                        {
                            this.chaseMouse();
                            this.eat();
                        }
                        else if (a == 1 || a == 6)
                        {
                            this.play();
                        }
                        else if (a == 2 || a == 7 || a==9)
                        {
                            this.relax();
                        }
                        else if (a == 3 || a==8)
                        {
                            this.walk();
                        }
                        else
                        {
                            this.sleep();
                        }
                    }
                }
            }
        }
    }
}