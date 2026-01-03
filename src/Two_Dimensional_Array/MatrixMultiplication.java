package Two_Dimensional_Array;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {3, 2, 1}};
        int[][] b = {{2, 0}, {-1, 3}, {4, 5}};
        int[][] c = new int[a.length][b[0].length];

        for (int i=0; i<a.length; i++){
            for (int j=0; j<b[0].length; j++){
                for (int k=0; k<a[0].length; k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        for (int i=0; i<c.length; i++){
            for (int j=0; j<c[0].length; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
