package If_Else;

import java.util.Scanner;

public class DivisibleOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (x % 5 == 0) System.out.println("Divisible of five");
        else System.out.println("Not divisible");
    }
}
