package Stacks;

class Node{
    int val;
    Node next;
    Node (int val){
        this.val = val;
    }
}

class MyStack{
    Node head;
    int len;

    int peek(){
        if (len==0){
            System.out.println("Stack Empty");
            return -1;
        }
        return head.val;
    }

    int pop(){
        if (len==0){
            System.out.println("Stack Underflow");
            return -1;
        }
        int ans = head.val;
        head = head.next;
        len--;
        return ans;
    }

    void push (int val){
        Node temp = new Node(val);
        if (len==0){
            head = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        len++;
    }

    int size(){
        return len;
    }

    void display(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println();
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        System.out.println("Size: "+st.size());

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println("Peek: "+st.peek());
        st.display();

        System.out.println("Size: "+st.size());
    }
}
