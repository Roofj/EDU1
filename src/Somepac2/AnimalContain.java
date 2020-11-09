package Somepac2;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AnimalContain
{
    ArrayList <Animal> animal = new ArrayList<>();
    int id, quantity, count;
    String name;

    public Animal getAnimal(int n){return this.animal.get(n);}
    public AnimalContain(String name, int quantity, int id)
    {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }
    public void addAnimal(Animal a)
    {
        if (this.id == a.getId() && this.quantity>this.count && !this.animal.contains(a))
        {
            this.animal.add(a);
            System.out.println(a.getName()+ " contain in "+ this.name+ " under the number "+ this.animal.indexOf(a));
            this.count++;
        }
        else if (this.quantity<=this.count&& this.id == a.getId() && !this.animal.contains(a))
        {
            System.out.println(this.name+ " crowded");
        }
        else if (this.quantity>this.count&& this.id == a.getId() && this.animal.contains(a))
        {
            System.out.println(a.getName()+ " already contained in "+ this.name);
        }
        else
        {
            System.out.println(a.getName()+ " can't contain in "+ this.name);
        }
    }
    public void getoutAnimal (Animal a)
    {
        if (this.animal.remove(a))
        {
            System.out.println(a.getName() + " get out of " + this.name);
            this.count--;
        }
        else
        {
            System.out.println(a.getName() + " not contained in " + this.name);
        }
    }
    static public AnimalContain forc = new AnimalContain("forc", 3, 1);
    static public AnimalContain forc1 = new AnimalContain("forc1", 3, 1);
    static public AnimalContain forh = new AnimalContain("forh", 3, 0);
    static public AnimalContain forh1 = new AnimalContain("forh1", 3, 0);
}
