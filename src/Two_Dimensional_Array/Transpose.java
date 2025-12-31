package Two_Dimensional_Array;

public class Transpose {
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

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        print(matrix);
    }
}
