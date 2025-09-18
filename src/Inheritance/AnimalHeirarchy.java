package Inheritance;


class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound...");
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof ");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow Meow ");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet Tweet ");
    }
}

public class AnimalHeirarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("Bruno", 3);
        Animal cat = new Cat("Kitty", 2);
        Animal bird = new Bird("Parrot", 1);

        dog.showInfo();
        dog.makeSound();

        cat.showInfo();
        cat.makeSound();

        bird.showInfo();
        bird.makeSound();
    }
}

