package Recursion;

public class GlobalVariable {
    static int x = 10;
    public static void main(String[] args) {
        x = 9;
        System.out.println(x);
        int x = 5;
        System.out.println(x);
    }
    public static void fun(int x, int n){
        System.out.println(x);
    }
}
