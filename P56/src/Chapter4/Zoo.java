package Chapter4;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

interface Generator<T> {
    T next();
}

/**
 * Created by PuFan on 2016/10/19.
 */
public class Zoo {
    static public void main(String[] args) {
        List<Animal> zoo = new LinkedList<>();
        for (int i = 0; i < 50; ++i)
            zoo.add(new PetGenerate().next());
        for (int i = 0; i < 50; ++i)
            zoo.get(i).move();
        Animal a1 = new Animal("a1", 4);
        Fish f1 = new Fish("f1");
        Bird b1 = new Bird("b1");
        a1.move();
        a1.move(3);
        f1.move();
        f1.move(3);
        b1.move();
        b1.move(3);
    }
}

class PetGenerate implements Generator<Animal> {
    static Random rand = new Random(73);
    private Class[] A = {Fish.class, Bird.class, Dog.class, Cat.class};

    public Animal next() {
        try {
            return (Animal) A[rand.nextInt(A.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Animal {
    private String name;
    private int legs;

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public Animal() {
        this.name = "Animal";
        this.legs = 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return legs == animal.legs &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, legs);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void move() {
        System.out.println(getName() + " Moving!!");
    }

    public void move(int i) {
        for (int j = 0; j < i; ++j)
            System.out.println(getName() + " Moving!!");
    }
}

class Fish extends Animal {
    public Fish(String name) {
        super(name, 0);
    }

    public Fish() {
        super("Fish", 0);
    }

    @Override
    public void move() {
        System.out.println(getName() + " Swimming!!");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name, 2);
    }

    public Bird() {
        super("Bird", 2);
    }

    @Override
    public void move() {
        System.out.println(getName() + " Flying!!");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name, 4);
    }

    public Dog() {
        super("Dog", 4);
    }

    @Override
    public void move() {
        System.out.println(getName() + " Running!!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name, 4);
    }

    public Cat() {
        super("Cat", 4);
    }

    @Override
    public void move() {
        System.out.println(getName() + " Running!!");
    }
}
