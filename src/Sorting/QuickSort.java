package Sorting;

public class QuickSort {
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[start];
        int count = 0;
        for (int i=start+1; i<=end; i++){
            if (arr[i]<=pivot){
                count++;
            }
        }

        int pivotIdx = start+count;
        int temp = arr[pivotIdx];
        arr[pivotIdx]=pivot;
        arr[start]=temp;

        int i=start;
        int j=end;
        while (i<pivotIdx && j>pivotIdx){
            while (arr[i]<=pivot){
                i++;
            }
            while (arr[j]>pivot){
                j--;
            }
            if (i<pivotIdx && j>pivotIdx){
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return start+count;
    }
    public static void quickSort(int[] arr, int start, int end){
        if (start>=end){
            return;
        }
        int pi = partition(arr, start, end);
        quickSort(arr, 0, pi-1);
        quickSort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 7, 4, 6, 9, 8};
        System.out.println("Before Sorting:");
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        quickSort(arr, 0, arr.length-1);
        System.out.println("After Sorting:");
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
