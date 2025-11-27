package Loops;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count = 0;
        if (n == 0) n = 1;
        while(n != 0){ // n jab tak 0 nahi hai tab tak 10 se divide karo
            n = n/10;
            count++;
        }
        System.out.println("Count : " + count);
    }
}
