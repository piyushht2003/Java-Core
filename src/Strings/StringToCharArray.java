package Strings;

public class StringToCharArray {
    public static void main(String[] args) {
        String s = "Piyush";
        char[] arr = s.toCharArray();

        for (char ch : arr){
            System.out.println(ch);
        }
    }
}

                /* output ->        P
                                    i
                                    y
                                    u
                                    s
                                    h                      ye char me convert hogaye hai */