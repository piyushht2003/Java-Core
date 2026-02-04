package Recursion;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {2,4,12,66,21,43,6};
        recPrint(arr,0);
        int target = 21;
        System.out.println(exists(arr, target,0));
    }
    public static boolean exists(int[] arr, int target, int idx){
        if (idx == arr.length) return false;
        if (arr[idx] == target) return true;
        return exists(arr,target,idx+1);
    }
    public static void recPrint(int[] arr, int idx){
        if (idx == arr.length) return;
        System.out.print(arr[idx] + " "); // normal printing
        recPrint(arr,idx+1);
//        System.out.print(arr[idx] + " ");  reverse printing
    }
}
