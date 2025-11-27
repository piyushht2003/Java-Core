package Pattern_Printing;

import java.util.Scanner;

public class LowerUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        /* Output :
                a a a a
                B B B B
                c c c c
                D D D D    */

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n; j++){
                if (i%2==0) System.out.print((char)(i + 64) + " ");
                else System.out.print((char)(i+96)+ " ");
            }
            System.out.println();
        }
    }
}
