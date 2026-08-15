package Stacks.Basic;

import java.util.Stack;

public class BasicSTLOFStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        // Here it will give error if there are no elements & we are trying to access stack

        /*
            -> EmptyStack exception
            st.pop();
            st.peek();
        */

        // now starting here we are pushing elements

        st.push("Piyush");
        st.push("Aditya");
        st.push("Rohan");
        st.push("Shaili");
        st.push("Ubaid"); // -> curr top element
        st.push("Jaid"); // -> top element -> removed line no.16

        // shows top element
        System.out.println(st.peek());

        // shows the size of the stack
        System.out.println(st.size());

        // removes top element
        st.pop();
        System.out.println(st.peek());
        System.out.println(st + " " + st.size());

        // shows topmost element and then removes it
        System.out.println(st.pop());
        System.out.println(st + " " + st.size());

        String s = st.pop();
        System.out.println(s);
        System.out.println(st + " " + st.size());
    }
}
