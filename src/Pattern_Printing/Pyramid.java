package Pattern_Printing;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int nsp = n-1, nst = 1;
        // Math wali method 1
//        for (int i=1; i<=n; i++) {
//            for (int j = 1; j <= n - i; j++) { // printing spaces
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= 2*i-1; j++) { // printing stars
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // NSP NST wali method 2
        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= nsp; j++) { // printing spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) { // printing stars
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }

    }
}
