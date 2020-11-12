package App;

import Somepac2.*;
import Somepac3.*;

import java.util.ArrayList;

public class Main
{
    public static void main (String[] args)
    {
        Duck.Donald.eat(Mutton.hip);
        Cat.Garfield.eat(Fruits.apple);
        Cat.Garfield.eat(Beef.hip);
        System.out.println(Cat.Garfield.getAP());
        System.out.println(Cat.Garfield.getSatiety());
        System.out.println(Cat.Barik.getName());
        /*System.out.println(ForCarnivorus.beef.getFoodid());
        AnimalContain.forc.addAnimal(Cat.Garfield);
        AnimalContain.forc.addAnimal(Cat.Barik);
        AnimalContain.forc.addAnimal(Cat.Leo);
        AnimalContain.forc1.addAnimal(Lion.Simba);
        AnimalContain.forc1.addAnimal(Lion.Alex);
        AnimalContain.forc1.addAnimal(Lion.Scar);
        AnimalContain.forh.addAnimal(Mouse.Jerry);
        AnimalContain.forh.addAnimal(Mouse.Pinky);
        AnimalContain.forh.addAnimal(Mouse.TheBrain);
        AnimalContain.forh1.addAnimal(Duck.Donald);
        AnimalContain.forh1.addAnimal(Duck.Launchpad);
        AnimalContain.forh1.addAnimal(Duck.Scrooge);
        //AnimalContain.putHM();
        //AnimalContain.putAnimal(Duck.Donald, AnimalContain.getHM("animalHashMap"));
        AnimalContain.getAnimal(Duck.Donald.getName(),AnimalContain.getHM("animalHashMap") ).eat(Grace.grace);
        */
        AnimalContain.forCarnivorous.putAnimal(Wolf.Akela);
        AnimalContain.forCarnivorous.deleteAnimal("Akela");
        AnimalContain.forCarnivorous.putAnimal(Wolf.Akela);
        AnimalContain.forCarnivorous.putAnimal(Cat.Leo);
        AnimalContain.forCarnivorous.putAnimal(Cat.Barik);
        AnimalContain.forCarnivorous.putAnimal(Cat.Garfield);
        AnimalContain.forCarnivorous.getAnimal("Akela").eat(Grace.grace);
        Duck.Donald.swim();
    }
}
