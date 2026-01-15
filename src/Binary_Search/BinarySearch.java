package Binary_Search;

import java.rmi.dgc.VMID;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-76, -4, 9, 29, 47, 49, 510, 615, 9911, 99999};
        System.out.print("Enter an element to search in the array: ");
        int target = sc.nextInt();

        int found=0, index=-1;
        int n = arr.length;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low+ high)/2;
            if (arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                found=1;
                index=mid;
                break;
            }
        }

        if (found==0){
            System.out.println("Element not found!");
        }
        else{
            System.out.println("Element found!");
            System.out.println("Index: "+index);
        }
    }
}
