package Arrays;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(33);
        arr.add(28);
        arr.add(36);
        arr.add(54);
        arr.add(21);
        arr.add(17);

//        System.out.println(arr);
        for (int ele : arr){
            System.out.print(ele+" ");
        }

        arr.set(2,45);
        int i = 0, j = arr.size()-1;
         while(i<j){
             int temp = arr.get(i);
             arr.set(i, arr.get(j));
             arr.set(j, temp);
             i++;
             j--;
         }
        System.out.println();
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        arr.remove(5);
        System.out.println();
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
