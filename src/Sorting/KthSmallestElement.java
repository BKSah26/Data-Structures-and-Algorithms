package Sorting;

import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7, 8, 1, 2, 4, 9, 3};
        System.out.print("Enter the value of k:");
        int k = sc.nextInt();

        for (int i=0; i<k; i++){
            int min = arr[i];
            int index = i;
            for (int j=i; j<arr.length; j++){
                if (arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println(arr[k-1]);
    }
}
