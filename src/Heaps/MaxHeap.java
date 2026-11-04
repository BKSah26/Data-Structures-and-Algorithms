package Heaps;

import java.util.*;

public class MaxHeap {
    public static class Heap{
        int[] arr;
        int idx = 1;
        Heap(int capacity){
            arr = new int[capacity+1];
            Arrays.fill(arr, Integer.MIN_VALUE);
        }

        int size(){
            return idx-1;
        }

        void peek(){
            if (idx==1){
                System.out.println("Heap is Empty!");
                return;
            }
            System.out.println("Peek: "+arr[1]);
        }

        void display(){
            if (idx==1){
                System.out.println("Heap is Empty!");
                return;
            }
            System.out.print("Heap: ");
            for (int i=1; i<idx; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        void add(int num){
            if (idx>=arr.length){
                System.out.println("Heap is Full!");
                return;
            }
            arr[idx]=num;
            idx++;

            int ptr = idx-1;
            while (ptr!=1){
                int parent = ptr/2;
                if (arr[ptr]>arr[parent]){
                    int temp = arr[ptr];
                    arr[ptr]=arr[parent];
                    arr[parent]=temp;
                    ptr=parent;
                }
                else{
                    break;
                }
            }
            System.out.println("Element Added: "+num);
        }

        void remove(){
            if (idx==1){
                System.out.println("Heap is Empty!");
                return;
            }
            int max = arr[1];
            System.out.println("Element Removed: "+max);
            arr[1]=arr[idx-1];
            arr[idx-1]=Integer.MIN_VALUE;
            idx--;

            int root = 1;
            int s = size();
            while (root<=s){
                int left = root*2;
                int right = root*2+1;
                int leftVal;
                int rightVal;

                if (left<=s){
                    leftVal = arr[left];
                }
                else{
                    leftVal=Integer.MIN_VALUE;
                }
                if (right<=s){
                    rightVal = arr[right];
                }
                else{
                    rightVal=Integer.MIN_VALUE;
                }

                if (arr[root]>leftVal && arr[root]>rightVal){
                    break;
                }
                else{
                    if (leftVal>rightVal){
                        int temp = arr[root];
                        arr[root]=arr[left];
                        arr[left]=temp;
                        root=left;
                    }
                    else{
                        int temp = arr[root];
                        arr[root]=arr[right];
                        arr[right]=temp;
                        root=right;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        Heap heap = new Heap(7);
        heap.add(10);
        heap.peek();
        heap.display();

        heap.add(15);
        heap.peek();
        heap.display();

        heap.add(8);
        heap.peek();
        heap.display();

        heap.add(9);
        heap.peek();
        heap.display();

        heap.add(4);
        heap.peek();
        heap.display();

        heap.remove();
        heap.peek();
        heap.display();

        heap.add(2);
        heap.peek();
        heap.display();

        heap.remove();
        heap.peek();
        heap.display();

        heap.add(12);
        heap.peek();
        heap.display();

        heap.add(5);
        heap.peek();
        heap.display();

        heap.add(17);
        heap.peek();
        heap.display();

        heap.add(14);
        heap.peek();
        heap.display();
    }
}
