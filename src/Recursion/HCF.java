package Recursion;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        System.out.println(hcf(765,295));
    }
    public static int hcf(int a, int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
}
