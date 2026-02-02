package Recursion;

public class FunctionCallingItself {
    public static void main(String[] args) {
        piyush();
    }
    public static void piyush(){
        System.out.println("aditya");
        piyush();
    }
    // infinite loop -> stackoverflow exception
}
