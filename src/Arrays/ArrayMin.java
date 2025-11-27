package Arrays;

public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {6, 23, 12, 63, 4, 7, -4, 15, -7, 1, 10, 4};
        int min = arr[0];
        int n = arr.length;

        // print minimum element of the array
        for (int i=0; i<n; i++){
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
