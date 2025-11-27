package Methods;

public class ReturnType {
    public static int hello(){
        System.out.println("Hello");
        return 10; // khatam
    }
    public static void main(String[] args) {
        int x = hello();
        System.out.println(3 + x); // taking as integer
//        hello(); // standalone call
    }
}
