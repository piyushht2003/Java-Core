package Strings;

public class ComprareToMethod {
    public static void compareTo(String a, String b){
        int m = a.length();
        int n = b.length();
        int j = (a.length()+b.length());
        for (int i = 0; i < a.length(); i++) {

        }
    }
    public static void main(String[] args) {
        String a = "rohan";
        String b = "piyush";
        System.out.println(a.compareTo(b)); // 'r-p = 2' r is 2 greater than to p compares ASCII values okayy!!
    }
}
