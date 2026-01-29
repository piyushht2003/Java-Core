package MultiDimensionalArray;

public class MinOutOfMaxArrayElement {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{2,4,1,5}, {3,2,1,4}};
        int maxSum = Integer.MIN_VALUE;
        int row = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < arr[0].length; j++) {
                max+=arr[i][j];
            }
            if (max > maxSum){
                maxSum = max;
                row = i;
            }
        }
        for (int j = 0; j < arr[row].length; j++) {
            if (arr[row][j] < min) {
                min = arr[row][j];
            }
        }
        System.out.println("Min element from max-sum row: " + min);
        System.out.println("Maximum row sum: " + maxSum);
    }
}
