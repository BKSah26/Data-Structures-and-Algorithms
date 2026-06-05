package Array;

import java.util.Scanner;

public class NegativeArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            System.out.print("Enter element no "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Negative Array Elements:");
        for (int i=0; i<n; i++){
            if (arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
