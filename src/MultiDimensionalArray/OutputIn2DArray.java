package MultiDimensionalArray;

public class OutputIn2DArray {
    public static void main(String[] args) {
//        int[][] arr = new int[3][4];
//        System.out.println(arr[0].length); // {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}}
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        int[][] arr = {{1,2,3,4},{2,4,1,5}, {3,2,1,4}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j]+" ");
                sum = sum +  arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
