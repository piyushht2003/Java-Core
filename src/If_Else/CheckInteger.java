package If_Else;

import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double n = sc.nextDouble();
//        int x = (int) n; ye bhi kar sakte hai lekin neeche wala short hai okayyyy
        if (n == (int) n ) System.out.println("It is an integer");
        else System.out.println("Not an integer");
    }
}
