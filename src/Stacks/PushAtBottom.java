package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);

        pushAtBottom(st, 10);
        System.out.println(st);
    }

    private static void pushAtBottom(Stack<Integer> st, int ele) {
        if (st.size()==0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, ele);
        st.push(top);
    }
}
