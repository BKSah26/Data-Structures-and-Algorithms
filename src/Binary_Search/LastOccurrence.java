package Binary_Search;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 11};
        int target = 2;

        int index=-1;
        int n = arr.length;
        int low=0, high=n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                index=mid;
                low=mid+1;
            }
        }
        System.out.println("Last Occurrence: "+index);
    }
}
