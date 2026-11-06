package Linked_Lists;

import java.util.*;

public class PalindromeLinkedList {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val =val;
        }
    }

    public static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newHead = slow.next;
        slow.next = null;

        Node prev = null;
        Node fwd = null;
        Node curr = newHead;

        while (curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        newHead = prev;

        Node i = head;
        Node j = newHead;

        while (i!=null && j!=null){
            if (i.val != j.val){
                return false;
            }
            i=i.next;
            j=j.next;
        }
        return true;
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

        boolean ans = isPalindrome(head);
        if (ans){
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not Palindrome");
        }
    }
}
