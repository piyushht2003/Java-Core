package OOPS;

public class Revision {
    private static class Pokemon{
        int power;
        String name;
        final String type = "Pokemon";

        Pokemon(int power, String name){ // This is a parameterized constructor
            this.power = power; // -> 'this' keyword is used here to point variable/member/attribute which is defined in the class
            this.name = name; // -> it is also working as a 'setter' method/function
        }
        Pokemon(){
            // default constructor
        }
        void print(){ // -> method is made to print
            System.out.println(type + " " + this.name + " " + this.power);
        }
    }
    public static void main(String[] args) {
        Pokemon c1 = new Pokemon(70,"Pikachu"); // -> this will point to parameterized constructor
        Pokemon c2 = new Pokemon(49,"Bulbasaur");
        c1.print();
        c2.print();
        Pokemon c3 = new Pokemon();
        c3.name = "Charizard"; // -> this will point to default constructor
        c3.power = 120;
        c3.print();
    }
}
