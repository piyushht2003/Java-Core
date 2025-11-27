package Loops;

import java.util.Scanner;

public class PowerLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a : ");
        int a = sc.nextInt();
        System.out.print("Enter the power b : ");
        int b = sc.nextInt();
        int p = 1;
        for (int i = 1; i<=b ; i++ ){
            p *= a;
        }
        System.out.println(a + " Raised to the power " + b + " is : " + p);
    }
}
