package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {6, 8, 1, 2, 4, 9};
        int i=0, j=arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
