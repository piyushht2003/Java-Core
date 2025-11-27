package Methods;

public class PassByValueAndReference {
    public static void change(int x){ // ye wala 'x'
        x = 10;
    }
    public static void main(String[] args) {
        int x = 7; // aur ye wala 'x' dono ke different location hai okay "_"
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
