package Heaps;

import java.util.*;

public class MinHeap {
    public static class Heap{
        int[] arr;
        int idx = 1;

        int size(){
            return idx-1;
        }

        void add(int ele){
            if (idx>=arr.length){
                System.out.println("Heap is Full!");
                return;
            }
            arr[idx]=ele;
            idx++;
            int ptr = idx-1;
            while (ptr!=1){
                int parent = ptr/2;
                if (arr[ptr]<arr[parent]) {
                    int temp = arr[ptr];
                    arr[ptr] = arr[parent];
                    arr[parent] = temp;
                    ptr /= 2;
                }
                else{
                    break;
                }
            }
        }

        void remove(){
            if (idx==1){
                System.out.println("Heap is Empty!");
                return;
            }
            int min = arr[1];
            System.out.println(min);
            arr[1]=arr[idx-1];
            arr[idx-1]=Integer.MAX_VALUE;
            idx--;

            int root = 1;
            int s = size();
            while(root <= s){
                int left = root*2;
                int right = root*2+1;
                int leftVal;
                int rightVal;

                if (left<=s){
                    leftVal = arr[left];
                }
                else{
                    leftVal=Integer.MAX_VALUE;
                }

                if (right<=s){
                    rightVal = arr[right];
                }
                else{
                    rightVal=Integer.MAX_VALUE;
                }

                if (arr[root]<leftVal && arr[root]<rightVal){
                    break;
                }
                else{
                    if (leftVal<rightVal){
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

        void display(){
            for (int i=1; i<idx; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        Heap(int capacity){
            arr = new int[capacity+1];
            Arrays.fill(arr, Integer.MAX_VALUE);
        }
    }
    public static void main(String[] args) {
        Heap heap = new Heap(10);
        heap.add(10);
        heap.display();

        heap.add(15);
        heap.display();

        heap.add(8);
        heap.display();

        heap.add(9);
        heap.display();

        heap.add(4);
        heap.display();

        heap.remove();
        heap.display();

        heap.add(2);
        heap.display();

        heap.remove();
        heap.display();
    }
}
