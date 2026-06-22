package Sorting;

public class MergeSort {
    public static void merge(int[] a, int[] b, int[] arr){
        int i=0, j=0, k=0;
        while (i<a.length && j<b.length){
            if (a[i]<=b[j]){
                arr[k]=a[i];
                i++;
            }
            else{
                arr[k]=b[j];
                j++;
            }
            k++;
        }
        while (i<a.length){
            arr[k]=a[i];
            i++;
            k++;
        }
        while (j<b.length){
            arr[k]=b[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if (n==1){
            return;
        }
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int idx = 0;
        for (int i=0; i<a.length; i++){
            a[i]=arr[idx];
            idx++;
        }
        for (int i=0; i<b.length; i++){
            b[i]=arr[idx];
            idx++;
        }
        mergeSort(a);
        mergeSort(b);
        merge(a, b, arr);
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 6, 7, 3, 4, 9};
        mergeSort(arr);
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
