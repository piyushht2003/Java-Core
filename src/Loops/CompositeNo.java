package Loops;

import java.util.Scanner;

public class CompositeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean flag = true; // true means prime
        for (int i = 2; i<=Math.sqrt(n); i++ ){
            if (n%i==0){ // 'i' to 'n' ka ek factor nikla
                flag = false;
                break;
            }
        }
        if (n == 1) System.out.println("Neither Composite nor Prime number");
        else if (flag == false) System.out.println("Composite number");
        else  System.out.println("Prime number");
    }
}
