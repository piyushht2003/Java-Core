package Methods;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.println("a is : " + a + "  " + "b is : " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Now a is : " + a + "  " + "Now b is : " + b);
    }
}
