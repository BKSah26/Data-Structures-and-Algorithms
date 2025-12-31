package Sorting;

public class BubbleSortOptimized {
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 8, 3, 4, 2};
        print(arr);

        for (int i=0; i<arr.length-1; i++){
            boolean isSorted = true;
            for (int k=0; k<arr.length-1; k++){
                if (arr[k]>arr[k+1]){
                    isSorted = false;
                    break;
                }
            }
            if (isSorted==true){
                break;
            }
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }
}
