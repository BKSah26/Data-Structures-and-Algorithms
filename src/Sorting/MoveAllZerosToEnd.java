package Sorting;

public class MoveAllZerosToEnd {
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 5, 0, 6, 8, 0, 3, 4, 2};
        print(arr);

        int j = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        print(arr);
    }
}
