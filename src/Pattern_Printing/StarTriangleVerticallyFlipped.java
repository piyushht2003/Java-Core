package Pattern_Printing;

import java.util.Scanner;

public class StarTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        // Not the method 1 Best way
//        for (int i=1; i<=m; i++){
//            for (int j=1; j<=m; j++){
//                if ((i+j)>m) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }
        // Best way method 2
        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= n - i; j++) { // printing spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) { // printing stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
