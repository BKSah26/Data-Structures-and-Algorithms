package Linked_Lists;

import java.util.*;

public class ReverseLinkedListUsingRecursion {
    public static class Node{
        int val;
        Node next;

        Node(){}
        Node(int val){
            this.val =val;
        }
    }

    public static Node reverse(Node head){
        if (head.next == null){
            return head;
        }
        Node a = head.next;
        head.next = null;
        Node b = reverse(a);
        a.next = head;
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of nodes in the Linked List: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the Linked List:");
        int first = sc.nextInt();
        Node head = new Node(first);
        Node ptr = head;

        for (int i=0; i<n-1; i++){
            int input = sc.nextInt();
            Node temp = new Node(input);
            ptr.next = temp;
            ptr = ptr.next;
        }

        Node newHead = reverse(head);
        ptr = newHead;
        while (ptr!=null){
            System.out.print(ptr.val+" ");
            ptr = ptr.next;
        }
    }
}
