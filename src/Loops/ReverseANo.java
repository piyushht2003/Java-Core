package Loops;

import java.util.Scanner;
import java.util.SortedMap;

public class ReverseANo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int number = n;// Here input 'n' is equal to variable 'number' e.g. 1234 -> reverse hua 4321 -> phir dono ka sum hoga -> 5555
        int reverse = 0;
        while(n!=0){
            reverse *= 10;
            reverse += n%10;
            n /= 10;
        }
        System.out.println("Reverse : " + reverse);

        // Also Printing the sum of the reverse no and original no.
        int sum = reverse + number;
        System.out.println("The sum of the numbers is : " + sum);
    }
}
