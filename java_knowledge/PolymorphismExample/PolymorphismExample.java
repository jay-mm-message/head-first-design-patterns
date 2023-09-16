class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

class Duck extends Animal {
    @Override
    void makeSound() {
        System.out.println("Quack!");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal duck = new Duck();
        
        dog.makeSound();
        cat.makeSound();
        duck.makeSound();
    }
}