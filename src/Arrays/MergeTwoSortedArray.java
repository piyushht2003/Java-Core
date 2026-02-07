package Arrays;

import java.util.ArrayList;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {2,5,4,9};
        int[] b = {1,3,4,5,7,8};
        int[] c = new int[a.length+b.length];

        for (int ele : c){
            System.out.print(ele + " ");
        }
        System.out.println();

        merge(c,a,b);

        for (int ele : c){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i=a.length-1, k=c.length-1, j=b.length-1;
        while(i>=0 && j>=0){
            if (a[i]>b[j]) c[k--] = a[i--];
            else c[k--] = b[j--];
        }
        while(i>=0){
            c[k--] = a[i--];
        }
        while(j>=0){
            c[k--] = b[j--];
        }
    }

//    public static void merge(int[] a, int[] b, int[] c) {
//        int i=0, j=0, k=0;
//        while(i<a.length&&j<b.length){
//            if (a[i]<b[j]) c[k++] = a[i++];
//            else c[k++] = b[j++];
//        }
//        while(i<a.length) c[k++] = a[i++];
//        while(i<b.length) c[k++] = b[i++];
//    }
}
