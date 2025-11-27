package Loops;

import java.util.Scanner;

public class GP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term : ");
        int n = sc.nextInt();
        // GP : 1, n, 2, n-1. 3, n-2
        for (int i = 1; i<=n; i++){
            System.out.print(i + " " + n + " ");
            n=n-1;
        }
    }
}
