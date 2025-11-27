package Basics;

public class TSAofCuboid {
    public static void main(String[] args) {
        int l = 9;
        int b = 15;
        int h = 20;
        int tsa = 2 * (l*b + b*h + h*l);
        System.out.println(tsa);
    }
}
