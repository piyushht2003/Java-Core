package Methods;

public class Syntax {
    public static void a(){
        b();
        System.out.println("a");
    }
    public static void main(String[] args) {
        a();
    }
    public static void b(){
        c();
        System.out.println("b");
    }
    public static void c(){
        d();
        System.out.println("c");
    }
    public static void d(){
        System.out.println("d");
    }
}
