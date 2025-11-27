package If_Else;

import java.util.Scanner;

public class Graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y : ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) System.out.println("Lies in 1st quadrant");
        else if (x < 0 && y > 0) System.out.println("Lies in 2nd quadrant");
        else if (x < 0 && y < 0) System.out.println("Lies in 3rd quadrant");
        else if (x > 0 && y < 0) System.out.println("Lies in 4th quadrant");
        else if (x == 0 && y == 0) System.out.println("Lies on the origin");
    }
}
