package Methods;

public class ReturnMandatory {
    public static void main(String[] args) {
        int x = kuch(20);
        System.out.println(x + 200);
    }

    public static int kuch(int a) {
        if (a>0) return 5;
        else return 10; // else is mandatory when using 'int' with return statement
    }
}
