package MultiDimensionalArray;

public class ForEach {
    public static void main(String[] args) {
        int[][] arr = {{22,12,53,64},{32,54,71,54}, {33,72,81,34}};

        for (int[] a : arr){
            for (int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
//        for (int i=0; i<arr.length; i++){
//            for (int ele : arr[i]){
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }
    }
}
