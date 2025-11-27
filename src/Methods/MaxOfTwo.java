package Methods;

public class MaxOfTwo {
    public static void main(String[] args) {
        int x = max(20, 22, 14);
        System.out.println(x);
    }
    public static int max(int a, int b, int c){
        if (a>b && a>c) return a;
        else if (b>a && b>c)return b;
        else return c;
    }
}
