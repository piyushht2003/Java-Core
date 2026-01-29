package Strings;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        String s = "I want to eat pasta!";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Vowel count: " + count);
    }
}
