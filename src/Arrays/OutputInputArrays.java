package Arrays;

import java.util.Scanner;

public class OutputInputArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] arr = {3,42,53,-1,21,-9}; // 6
//        int n = arr.length; // index - 0 to n-1
//        for (int i=0; i<n; i++){
//            System.out.print(arr[i] + " ");
//        }



        int[] arr = new int[7];

        // Default value of the array is always '0'
//        for (int i=0; i<7; i++){
//            System.out.print(arr[i] + " ");
//        }

        //input

        for (int i = 0; i<7; i++){
            arr[i] = sc.nextInt();
        }

        // print
        for (int i = 0; i<7; i++){
            System.out.print(arr[i] * 2 + " ");
        }
    }
}
