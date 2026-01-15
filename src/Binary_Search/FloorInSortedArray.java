package Binary_Search;

import java.util.Scanner;

public class FloorInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-9, -7, -2, 0, 1, 2, 2, 5, 7, 11, 13};
        System.out.print("Enter an integer: ");
        int val = sc.nextInt();

        int n = arr.length;
        int low = 0, high = n-1;
        int idx=-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]>val){
                high=mid-1;
            }
            else if(arr[mid]<=val){
                idx=mid;
                low=mid+1;
            }
        }
        System.out.println("Floor Index: "+idx);
        System.out.println("Floor Value: "+arr[idx]);
    }
}
