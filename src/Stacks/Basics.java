package Stacks;

import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Bipin");
        st.push("Gopal");
        st.push("Ashmit");
        st.push("Pranjal");
        st.push("Priyanshu");

        System.out.println(st.size());
        System.out.println(st);

        st.pop();
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
    }
}
