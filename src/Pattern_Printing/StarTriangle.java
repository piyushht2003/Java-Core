package Pattern_Printing;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
/*
            ye ek aur tarika hai
            for (int j = 1; j<=n; j++){
                if (j<=i)System.out.print("* ");
                else System.out.print(" ");
            }
*/
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
