package Recursion;

import java.util.Scanner;

public class ARaisedToThePowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int a = sc.nextInt();
        System.out.print("Enter power  : ");
        int b = sc.nextInt();
        System.out.print(a + " raised to the power " + b + " is : " + pow(a,b));

    }
    public static int pow(int a, int b) {
        if(b==0) return 1;
        int call = pow(a,b/2);
        if (b%2==0) return call*call;
        else return a*call*call;
        //        return a*pow(a,b-1);
    }
}
        /*
                    using for loop

        int ans = 1;
        for (int i = 0; i < b; i++) {
            ans *= a;
        }
        System.out.print(a + " raised to the power " + b + " is : " + ans);

         */
