package Array;

import java.util.Arrays;

public class DeepCopy {
    public static void print(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        print(arr);

        int[] deepcopy1 = Arrays.copyOf(arr, arr.length);
        deepcopy1[0] = 11;

        print(arr);
        print(deepcopy1);

        int[] deepcopy2 = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            deepcopy2[i]=arr[i];
        }
        deepcopy2[0]=11;
        print(arr);
        print(deepcopy2);
    }
}
