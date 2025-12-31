package Sorting;

import java.util.Arrays;

public class TwoSum {
    public static void print(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {7, 0, 4, 3, 2, 8, 10};
        int target = 9;
        Arrays.sort(arr);
        int[] targetarr = new int[2];
        int i = 0, j = arr.length-1;
        while (i<j){
            if (arr[i]+arr[j]<target){
                i++;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else if(arr[i]+arr[j]==target){
                targetarr[0]=arr[i];
                targetarr[1]=arr[j];
                break;
            }
        }
        print(targetarr);
    }
}
