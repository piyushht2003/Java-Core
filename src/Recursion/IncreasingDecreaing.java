package Recursion;

import java.util.Scanner;

public class IncreasingDecreaing {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        if (n==0) return;
        System.out.print(n + " ");                          // notice this line only it will still print 1 to n o/p -> '1 2 3 4 5 '
        print(n-1);
        if (n!=1) System.out.print(n + " ");                          // notice this line only it will still print 1 to n o/p -> '1 2 3 4 5 '
    }
}
