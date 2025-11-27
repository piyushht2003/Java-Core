package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] x = {2, 4, 3, 1, 9, -1};
        System.out.print("This is refence variable x : ");

        System.out.println();
        change(x); // changed the value 3 -> 29
        System.out.println("Updated value of x : " + x[2]);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

    }

    public static void change(int[] y){ // 'y' is a refence variable -> {2, 4, 3, 1, 9, -1} which means it is carrying the value of array 'x'
        System.out.print("This is refence variable y : ");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + " ");
        }
        y[2] = 29;
        System.out.println();
        // {2, 4, 3 -> 29, 1, 9, -1}
    }
}
