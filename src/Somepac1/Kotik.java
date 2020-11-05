package Somepac1;

public class Kotik {
    int satiety;
    int AP;
    String name;

    public void eat(int hungry) {
        this.satiety += hungry;
        --this.AP;
    }

    public void eat(int hungry, String food) {
        this.satiety = hungry;
        --this.AP;
        System.out.println(this.name + " eat " + food);
    }

    public void eat() {
        this.eat(3, "Mouse");
    }

    public void play() {
        this.satiety -= 2;
        --this.AP;
        System.out.println(this.name + " play");
    }

    public void sleep() {
        --this.satiety;
        this.AP += 5;
        System.out.println(this.name + " sleep");
    }

    public void walk() {
        this.satiety -= 2;
        --this.AP;
        System.out.println(this.name + " walk");
    }

    public void chaseMouse() {
        this.satiety -= 3;
        --this.AP;
        System.out.println(this.name + " chase Mouse.");
    }

    public void dead() {
        System.out.println(this.name + " is dead");
    }

    public void relax() {
        --this.satiety;
        ++this.AP;
        System.out.println(this.name + " relax");
    }

    public Kotik(String name, int satiety, int AP) {
        this.name = name;
        this.satiety = satiety;
        this.AP = AP;
    }

    public void liveAnotherDay() {
        for(int n = 0; n < 24; ++n) {
            System.out.println(n);
            if (this.satiety <= -5) {
                this.dead();
            } else if (this.AP < 0) {
                this.sleep();
                System.out.println(this.name + " not dead");
            } else if (this.satiety < 0) {
                this.chaseMouse();
                this.eat();
                System.out.println(this.name + " not dead, not sleep");
            } else {
                System.out.println(this.name + " not dead, not sleep, not eat");
                int a = (int)(Math.random() * 10.0D);
                if (a != 0 && a != 5) {
                    if (a != 1 && a != 6) {
                        if (a != 2 && a != 7 && a != 9) {
                            if (a != 3 && a != 8) {
                                this.sleep();
                            } else {
                                this.walk();
                            }
                        } else {
                            this.relax();
                        }
                    } else {
                        this.play();
                    }
                } else {
                    this.chaseMouse();
                    this.eat();
                }
            }
        }

    }
    public void liveAnotherDay(int b)
    {
        for(int n = 0; n < 24; ++n)
        {
            System.out.println(n);
            if (this.satiety <= -5) {
                this.dead();
            } else if (this.AP < 0) {
                this.sleep();
                System.out.println(this.name + " not dead");
            } else if (this.satiety < 0) {
                this.chaseMouse();
                this.eat();
                System.out.println(this.name + " not dead, not sleep");
            } else
            {
                System.out.println(this.name + " not dead, not sleep, not eat");
                int a = (int)(Math.random() * 10.0D);
                switch (a)
                {
                    case 0:
                    case 1: this.chaseMouse();this.eat();break;
                    case 2:
                    case 3: this.play(); break;
                    case 4:
                    case 5: this.relax(); break;
                    case 6:
                    case 7:
                    case 8: this.walk(); break;
                    case 9: this.sleep(); break;
                }
            }
        }
    }

}
