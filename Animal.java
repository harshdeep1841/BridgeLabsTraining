//Inheritance
public class Animal {

    public void eat() {
        System.out.println("Animal is eating");
    }

  

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}

class Dog extends Animal {

    public void bark() {
        System.out.println("Dog is barking");
    }
}

