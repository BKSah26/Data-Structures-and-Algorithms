package Array;

public class ShallowCopy {
    public static void print(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        print(arr);

        int[] arr1 = arr;
        arr1[0] = 11;
        print(arr);
    }
}
