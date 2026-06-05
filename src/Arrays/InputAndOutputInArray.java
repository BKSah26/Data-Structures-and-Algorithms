package Array;

import java.util.Scanner;

public class InputAndOutputInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {5, -2, 1, 7, 12, 6, 8, 15};
        int n = arr1.length;
        for (int i=0; i<n; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        int[] arr2 = new int[7];
        //When no value is entered in an array, the default value is 0.
        for (int i=0; i<7; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        for (int i=0; i<7; i++){
            System.out.print("Enter element no "+(i+1)+": ");
            arr2[i] = sc.nextInt();
        }
        for (int i=0; i<7; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
