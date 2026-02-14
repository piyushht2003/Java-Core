package OOPS;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Kutta Bole Bhau Bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Billi Bole Meow Meow");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Piyush Bole Hao Hao");
        }
    }

    public static void main(String[] args) {
        Dog tommy = new Dog();
        tommy.speak();
        Cat HappyCat = new Cat();
        HappyCat.speak();
        Human Piyush = new Human();
        Piyush.speak();
    }
}
