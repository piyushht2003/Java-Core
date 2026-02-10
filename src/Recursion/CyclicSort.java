package Recursion;

public class CyclicSort {
        public int[] findErrorNums(int[] arr) {
            int n = arr.length;
            int[] ans = new int[2];
            int i = 0;
            while(i<arr.length){
                int rightIdx = arr[i] - 1;
                if(arr[i] == i+1 || arr[rightIdx] == arr[i]) i++;
                else {
                    swap(arr, i, rightIdx);
                }
            }
            for(i=0; i<arr.length; i++){ //checking the correct index
                if(arr[i] != i+1) {
                    ans[0] = arr[i];
                    ans[1] = i+1;
                }
            }
            return ans;
        }
        private void swap(int[] arr, int i, int idx){
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
}
