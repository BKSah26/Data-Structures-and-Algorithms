package Linked_Lists;

import java.util.*;

public class MergeSortOnLinkedList {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public static Node merge(Node head1, Node head2){
        Node temp = new Node(-1);
        Node i = head1;
        Node j = head2;
        Node k = temp;

        while (i!=null && j!=null){
            if (i.val<j.val){
                k.next = i;
                i=i.next;
            }
            else{
                k.next = j;
                j=j.next;
            }
            k=k.next;
        }

        if (i!=null){
            k.next = i;
        }
        if (j!=null){
            k.next = j;
        }
        return temp.next;
    }

    public static Node sort(Node head){
        if (head.next == null){
            return head;
        }

        Node slow = head;
        Node fast = head;
        while (fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head1 = head;
        Node head2 = slow.next;
        slow.next = null;

        head1 = sort(head1);
        head2 = sort(head2);
        return merge(head1, head2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements in the Linked List: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements in Linked List:");
        int firstEle = sc.nextInt();
        Node head = new Node(firstEle);
        Node ptr = head;

        for (int i=0; i<n-1; i++){
            int input = sc.nextInt();
            Node newNode = new Node(input);
            ptr.next = newNode;
            ptr = ptr.next;
        }


        Node sorted = sort(head);
        ptr = sorted;
        while (ptr!=null){
            System.out.print(ptr.val+" ");
            ptr = ptr.next;
        }
    }
}
