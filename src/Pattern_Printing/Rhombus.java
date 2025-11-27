package Pattern_Printing;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        // Rhombus
        System.out.println("Rhombus : ");
        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= n - i; j++) { // printing spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) { // printing stars
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Vertically flipped right angle triangle
        System.out.println("Triangle : ");
        for (int i=1; i<=n; i++) {
            for (int j = 2; j <= i; j++) { // printing stars
                System.out.print("  ");
            }
            for (int j = 0; j <= n- i; j++) { // printing spaces
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
