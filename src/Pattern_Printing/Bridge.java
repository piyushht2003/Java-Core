package Pattern_Printing;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
            for (int j=1; j<=n*2-1; j++){ // first line
                System.out.print("* ");
            }
        System.out.println();
            int nsp=1;
            for (int i=1; i<=n-1; i++){
                for (int j=1; j<=n-i; j++){ // stars
                    System.out.print("* ");
                }
                for (int j=1; j<=nsp; j++){ // spaces
                    System.out.print("  ");
                }
                for (int j=1; j<=n-i; j++){ // stars
                    System.out.print("* ");
                }
                nsp+=2;
            System.out.println();
        }
    }
}
