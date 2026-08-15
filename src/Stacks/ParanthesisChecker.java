package Stacks;

import java.util.Stack;

public class ParanthesisChecker {
    public static void main(String[] args) {

    }
    public boolean isBalanced(String s) {
        if(s.length()%2==1) return false;
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch =='{') st.push(ch);
            else{
                if(st.size()==0) return false;
                char top = st.peek();
                if(sameBrackets(top, ch)) st.pop();
                else return false;
            }
        }
        return st.size()==0;
    }

    boolean sameBrackets(char a, char b) {
        if(a=='[' && b==']') return true;
        if(a=='{' && b=='}') return true;
        if(a=='(' && b==')') return true;
        return false;
    }
}
