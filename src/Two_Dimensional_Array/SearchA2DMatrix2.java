package Two_Dimensional_Array;

import java.util.Scanner;

public class SearchA2DMatrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {{1, 2, 4, 2}, {1, 5, 9, 7}, {1, 9, 8, 4}};
        System.out.print("Enter the element to be searched:");
        int n = sc.nextInt();

        int[] index = {-1, -1};
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (matrix[i][j]==n){
                    index[0] = i;
                    index[1] = j;
                    break;
                }
            }
        }

        if (index[0]!=-1 && index[1]!=-1){
            System.out.println("Element found!");
            System.out.println("Index: "+index[0]+", "+index[1]);
        }
    }
}
