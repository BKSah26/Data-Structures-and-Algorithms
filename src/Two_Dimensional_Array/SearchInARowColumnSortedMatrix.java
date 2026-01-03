package Two_Dimensional_Array;

import java.util.Scanner;

public class SearchInARowColumnSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.print("Enter element to be searched: ");
        int target = sc.nextInt();
        boolean found = false;
        int i=0;
        int j = matrix.length-1;

        while(j>=0 && i<matrix.length){
            if (matrix[i][j]>target){
                j--;
            }
            else if(matrix[i][j]<target){
                i++;
            }
            else{
                found = true;
                break;
            }
        }
        if (found == true){
            System.out.println("Element found!");
        }
        else{
            System.out.println("Element not found.");
        }
    }
}
