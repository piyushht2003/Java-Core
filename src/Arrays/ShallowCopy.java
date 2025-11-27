package Arrays;

public class ShallowCopy {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 0, 11};
        int[] x = arr; // x is a shallow copy of the arr
        System.out.println(x[0]);
    }
}
