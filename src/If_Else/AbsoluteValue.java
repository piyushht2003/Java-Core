package If_Else;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if (x >= 0) System.out.println(x);
        else System.out.println(-x); // input = -52, output = 52 multiply -1 to the number to get the positive number
    }
}
