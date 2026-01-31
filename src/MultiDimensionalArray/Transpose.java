package MultiDimensionalArray;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{22,12,53,64},{32,54,71,54}, {33,72,81,34}, {89,19,51,14}};
        print(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
    }
    public static void print(int arr[][]){
        for (int[] a : arr) {
            for (int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
