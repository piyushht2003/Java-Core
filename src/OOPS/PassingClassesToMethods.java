package OOPS;

public class PassingClassesToMethods {
    public static class Car{
        String name;
        String price;
        int wheels;
        int seats;
        void print(){
            System.out.print("Name - " + name + " Price - " + price + " Total Wheels - " + wheels + " Total seats - " + seats + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Tata Siera";
        c1.price = "12,00,000";
        c1.wheels = 5;
        c1.seats = 5;

        Car c2 = new Car();
        c2.name = "Thar";
        c2.price = "12,00,000";
        c2.wheels = 5;
        c2.seats = 5;

        c1.print();
        c2.print();

//        change(c2);
    }

    private static void change(Car c) {
        c.name = "Kia";               // objects can be changed using methods
    }
}
