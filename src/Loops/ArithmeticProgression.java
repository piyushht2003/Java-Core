package Loops;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2,5,8,11 ... n ; d = 3; a = 2;
//        Here we are dependent on i
//        for (int i = 2; i<= 3*n-1; i+=3 ){
//            System.out.print(i + " ");
//        }
        System.out.print("Enter the first term : ");
        int a = sc.nextInt();
        System.out.print("Enter the difference : ");
        int d = sc.nextInt();
        System.out.print("Enter the value of nth term : ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++ ){
            System.out.print(a + " ");
            a += d;
        }
    }
}
