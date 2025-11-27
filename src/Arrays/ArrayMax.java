package Arrays;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {-4, 8, 9, -9, 21, 42, 46, 15, 63};
        int max = arr[0];
        int n = arr.length;
        for (int i=0; i<n; i++){
            if (arr[i]>max) max = arr[i];
        }
        System.out.println(max);
    }
}
