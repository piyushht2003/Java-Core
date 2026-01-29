package MultiDimensionalArray;

public class SnakePrintColumnWise {
    public static void main(String[] args) {
        int[][] arr = {{22,12,53,64},{32,54,71,54}, {33,72,81,34}, {89,19,51,14}};
        for (int i = 0; i<arr[0].length; i++){
            if (i%2==0){
                for (int j = 0; j<arr[0].length; j++){
                    System.out.print(arr[j][i] + " ");
                }
            }
            else {
                for (int j = arr.length-1; j>=0; j--) {
                    System.out.print(arr[j][i] + " ");
                }
                }
                System.out.println();
            }
        }
    }
