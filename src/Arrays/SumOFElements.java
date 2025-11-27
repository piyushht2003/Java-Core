package Arrays;

import java.util.Scanner;

public class SumOFElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements : ");
        int[] arr = new int[n];
        int sum = 0;
        int product = 1;

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Sum of the array
        for (int i=0; i<n; i++){
            sum += arr[i];
        }

        // product of the array
        for (int i=0; i<n; i++){
            product *= arr[i];
        }
        System.out.print("The sum is : "+ sum + " " + "and the product is : " +product);
    }
}
