package MultiDimensionalArray;

public class MaxSumRow {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{2,4,1,5}, {3,2,1,4}};
        int maxSum = Integer.MIN_VALUE;
        int row = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum+=arr[i][j];
            }
            if (sum > maxSum){
                maxSum = sum;
                row = i;
            }
        }
        System.out.println(row + " " + maxSum);
    }
}
