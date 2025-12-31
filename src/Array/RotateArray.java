package Array;

import java.util.Scanner;

public class RotateArray {
    public static void reverse(int[] array, int start, int end){
        int i=start, j = end;
        while (i<j){
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }

    }

    public static void print(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {6, 8, 1, 2, 4, 9, 0};
        System.out.print("Enter by how much Array should be rotated:");
        int r = sc.nextInt();
        r = r%arr.length;
        reverse(arr, 0, r-1);
        reverse(arr, r, arr.length-1);
        reverse(arr, 0, arr.length-1);
        print(arr);
    }
}
