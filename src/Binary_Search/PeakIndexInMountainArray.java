package Binary_Search;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, 5, 8, 6, 3, -1, -7, -9, -11, -13, -17};

        int n=arr.length;
        int low = 1, high=n-2;
        int element = arr[0];
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                element = arr[mid];
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]){
                high=mid-1;
            }
        }
        System.out.println("Peak Element: "+element);
    }
}
