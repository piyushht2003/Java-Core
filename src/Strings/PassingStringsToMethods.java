package Strings;

public class PassingStringsToMethods {
    public static void change(String x){
        x = "Raghav Sir"; // it will be created in a totally different address compared to the below void function
    }
    public static void main(String[] args) {
        String x = "Piyush";
        System.out.println(x); // Piyush
        change(x);             // it won't do anything
        System.out.println(x); // Piyush
    }
}
