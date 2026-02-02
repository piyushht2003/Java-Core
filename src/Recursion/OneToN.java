package Recursion;

import java.util.Scanner;

public class OneToN {
    static int n; // this is a Global variable it can be accessed to everyone
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        if (n==0) return;
        print(n-1);
        System.out.print(n + " ");                          // notice this line only it will still print 1 to n o/p -> '1 2 3 4 5 '
    }

        /*


        using global variable


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
            n = sc.nextInt();
            print(1);
        }

        public static void print(int x){                  // x receiving -> 1 as a parameter
            if (x>n) return;
            System.out.print(x + " ");
            print(x+1); // 1 + 1 -> 2 to n
        }



        without using global variable


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
            n = sc.nextInt();
            print(1,n);
        }

        public static void print(int x, int n){           // taking two parameters
            if (x>n) return;
            System.out.println(x);
            print(x+1, n);
        }


        */
}
