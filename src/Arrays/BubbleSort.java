package Arrays;

public class BubbleSort {
    public static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {0,1,-2,4,7,2,8,-1};
        print(arr);
        int n = arr.length;

//        for (int i = 0; i < n-1; i++) {
//            for (int j = 0; j < n-1-i; j++) {
//                if (arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

        // BubbleSort Optimised ye wala jyada better hai dono se because of boolean cause it takes less space

//        for (int i = 0; i < n-1; i++) {
//            boolean isSorted = true;
//            for (int j = 0; j < n-1-i; j++) {
//                if (arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    isSorted = false;
//                }
//            }
//            if (isSorted) break;
//        }

        // BubbleSort Optimised dusra wala

        for (int i = 0; i < n-1; i++) {
            int swaps = 0;
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if (swaps==0) break;
        }
        print(arr);
    }
}
