package Sorting;

public class InsertionSort {
    public static void print(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 7, 3, 9, 1, 0, 8};

        for (int i=1; i<arr.length; i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        print(arr);
    }
}
