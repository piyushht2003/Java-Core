package Loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        // GP : 1,2,4,8....
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st term : ");
        int a = sc.nextInt();
        System.out.print("Enter the common ratio : ");
        int r = sc.nextInt();
        System.out.print("Enter the nth term : ");
        int n = sc.nextInt();
        // GP formula : a = a.r^n-1
        for (int i = 1; i<=n; i++){
            System.out.print(a + " ");
            a*=r; // a = a * r
        }
    }
}
