package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double pi = 3.141592;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double r = sc.nextDouble();
        double a = pi*r*r;
        System.out.print("Area of circle is : ");
        System.out.println(a);
    }
}
