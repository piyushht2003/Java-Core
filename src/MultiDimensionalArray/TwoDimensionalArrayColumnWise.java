package MultiDimensionalArray;

public class TwoDimensionalArrayColumnWise {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{2,4,1,5}, {3,2,1,4}};

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
