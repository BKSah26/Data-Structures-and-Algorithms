package Two_Dimensional_Array;

import java.util.Scanner;

public class InputIn2DArray {
    public static void print(int[][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][4];

        System.out.println("Enter elements of the matrix:");
        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1[0].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        print(arr1);
    }
}
