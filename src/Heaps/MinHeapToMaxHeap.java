package Heaps;

import java.util.*;

public class MinHeapToMaxHeap {
    public static void maxHeapify(int[] arr, int idx, int n){
//        int n = arr.length;
        int root = idx;

        while (root<=n){
            int left = root*2;
            int right = root*2+1;
            int leftVal;
            int rightVal;

            if (left<=n){
                leftVal = arr[left];
            }
            else{
                leftVal = Integer.MIN_VALUE;
            }
            if (right<=n){
                rightVal = arr[right];
            }
            else{
                rightVal = Integer.MIN_VALUE;
            }

            if (arr[root]>leftVal && arr[root]>rightVal){
                break;
            }
            else{
                if (leftVal>rightVal){
                    int temp = arr[root];
                    arr[root]=arr[left];
                    arr[left]=temp;
                    root = left;
                }
                else{
                    int temp = arr[root];
                    arr[root]=arr[right];
                    arr[right]=temp;
                    root = right;
                }
            }
        }
    }
    public static void convertToMaxHeap(int[] arr, int n){
//        int n = arr.length;
        for (int i=(n/2); i>=1; i--){
            maxHeapify(arr, i, n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements in the Min Heap: ");
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        System.out.println("Enter the elements in the Min Heap:");
        for (int i=1; i<=n; i++){
            arr[i]=sc.nextInt();
        }

        convertToMaxHeap(arr, n);

        System.out.println("Max Heap:");
        for (int i=1; i<=n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
