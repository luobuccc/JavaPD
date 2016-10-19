package Chapter3;

/**
 * Created by PuFan on 2016/10/19.
 */
public class Inheract {
    static public void main(String[] args) {
        Pet p = new Cat();
        Pet p1 = new Dog();
        p.eat();
        p1.eat();

    }
}

class Pet {
    private String Name;

    String getName() {
        return this.getClass().toString();
    }

    void eat() {
        System.out.println(getName() + " is eating");
    }

    void sleep() {
        System.out.println(getName() + " is sleeping");
    }
}

class Cat extends Pet {

}

class Dog extends Pet {
    public void fly() {
        System.out.println("I'm fly");
    }
}

class Apple extends Pet {

}