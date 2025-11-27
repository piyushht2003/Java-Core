package If_Else;

import java.util.Scanner;

public class FourDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (n > 999 && n <10000) System.out.println("Is a Four digit number");
        else System.out.println("Not a Four digit number");
    }
}
