package Sorting;

public class SelectionSort {
    public static void print(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 8, 3, 4, 2};
        print(arr);

        for (int i=0; i<arr.length; i++){
            int min = arr[i];
            int index = i;
            for (int j=i; j<arr.length; j++){
                if (arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        print(arr);
    }
}
