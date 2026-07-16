//Compile-time Polymorphism
class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(10,20));
        System.out.println(c.add(10,20,30));
    }
}

//Runtime Polymorphism
class Animal {

    public void sound() {
        System.out.println("Animal makes sound");
    }
}


class Dog extends Animal {

   
    public void sound() {
        System.out.println("Dog barks");
    }
}