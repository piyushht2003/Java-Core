package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {2, 54, 21, 63, 14, 84, 28, 70, 12, 94};
        int n = arr.length;
        int d = 3;
        rotate(arr, 0, d-1);
        rotate(arr, d, n-1);
        rotate(arr, 0, n-1);

        System.out.println("Array after rotating by " + d + " positions:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotate(int[] arr, int i, int j){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
