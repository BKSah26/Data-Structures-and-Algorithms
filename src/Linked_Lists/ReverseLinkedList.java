package Linked_Lists;

import java.util.*;

public class ReverseLinkedList {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val =val;
        }
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

        Node prev = null;
        Node fwd = null;
        Node curr = head;

        while (curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        head = prev;
        ptr = head;
        while (ptr!=null){
            System.out.print(ptr.val+" ");
            ptr=ptr.next;
        }
    }
}
