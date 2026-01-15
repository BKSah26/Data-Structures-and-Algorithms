package Binary_Search;

public class BinarySearchInDescendingOrderArray {
    public static void main(String[] args) {
        int[] arr = {100, 91, 87, 76, 66,52, 43, 35, 29, 13, 5};
        int target = 43;

        int n = arr.length;
        int low = 0, high=n-1;
        int found = 0, index=-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]>target){
                low=mid+1;
            }
            else if(arr[mid]<target){
                high=mid-1;
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
