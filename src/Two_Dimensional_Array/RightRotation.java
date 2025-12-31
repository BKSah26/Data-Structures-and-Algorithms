package Two_Dimensional_Array;

public class RightRotation {
    public static void print(int[][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {{2, 8, 3, 4}, {7, 2, 1, 6}, {5, 5, 4, 1}, {3, 1, 8, 2}};
        System.out.println("Original Matrix:");
        print(matrix);

        //Transpose
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //Right rotation
        for (int i=0; i<matrix.length; i++){
            int j=0;
            int k = matrix.length-1;
            while (j<k){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                j++;
                k--;
            }
        }
        System.out.println("Matrix after right rotation:");
        print(matrix);
    }
}
