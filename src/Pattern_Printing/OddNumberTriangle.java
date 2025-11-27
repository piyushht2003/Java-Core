package Pattern_Printing;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        for (int i=1; i<=m; i++){
            // With taking variable
//            int a = 1;
//            for (int j=1; j<=i; j++){
//                System.out.print(a+" ");
//                a+=2;
            // Without taking variable
            for (int j=1; j<=i; j++){
                System.out.print(2*j-1+" ");
            }
            System.out.println();
        }
    }
}
