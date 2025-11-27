package Arrays;

public class MissingNoInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = arr.length;
        int sum = n*(n+1)/2;
        int arrSum = 0;
         for (int ele : arr){
             arrSum += ele;
         }

        System.out.println(sum);
    }
}
