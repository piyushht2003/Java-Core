package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] x = {6,4,7,8,3,9};
        // indexing
        System.out.println(x[0]); // access
        // updating elements -> mutability , which means we can change the value of the array
        x[3] = 89;
        System.out.println(x[3]);

        int[] arr = new int[4]; // arr size =4 -> 0, 1, 2, 3
        // individually giving values
        arr [0] = 4;
        arr [1] = 12;
        arr [2] = 19;
        arr [3] = -9;
    }
}
