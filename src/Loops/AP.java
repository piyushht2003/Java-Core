package Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // we can also do it using 'a' but use it only you want the nth term otherwise use 'i' if you know the conditions
        System.out.print("Enter the first term : ");
        int a = sc.nextInt();
        System.out.print("Enter the difference : ");
        int d = sc.nextInt();

        for (int i = a; i>0; i-=d ){
            System.out.print(i + " ");
        }
    }
}
