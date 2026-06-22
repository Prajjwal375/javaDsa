public class Inheritance { 
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);

    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Multi-level Inheritance
class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}


///////////////////----------///////////////////
// Hierarchial Inheritance
class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}
class Fish extends Animal {
    void swim() {
        System.out.println("terti hai");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}
// Derived class // sub class
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("swi sin water");
    }
}

