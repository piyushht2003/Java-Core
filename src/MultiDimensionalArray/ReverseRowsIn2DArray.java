package MultiDimensionalArray;

public class ReverseRowsIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{22,12,53,64},{32,54,71,54}, {33,72,81,34}, {89,19,51,14}};
        for (int i = 0; i < arr.length; i++) {
            for (int j =  arr[0].length-1; j >=0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
//            for (int j = arr[0].length-1; j>=0; j--){
//                System.out.print(arr[j][i] + " ");
//            }
//            System.out.println();
        }
    }
}
