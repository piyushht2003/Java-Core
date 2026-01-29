package Strings;

public class BuiltInMethods {
    public static void main(String[] args) {
        String s = "Piyush thakur";

        System.out.println(s.toLowerCase()); // returns first occurrence index number -> 3

        System.out.println(s.lastIndexOf('u')); // returns last occurrence index number -> 11

        System.out.println(s.contains("yush")); // it checks weather its present in the string or not and returns true or false it should be always lagataar tho

        if (s.contains("yush")) System.out.println("Main honn bazigar"); // this is a condition
    }
}
