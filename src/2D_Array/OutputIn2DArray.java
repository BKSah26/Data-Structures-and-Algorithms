package Two_Dimensional_Array;

public class OutputIn2DArray {
    public static void print(int[][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr1 = new int[3][4];
        print(arr1);
        System.out.println("No of Rows: "+ arr1.length);
        System.out.println("No of Columns: "+ arr1[0].length);

        int[][] arr2 = {{6, 0, 2, 7, 6}, {1, 3, 7, 2, 2}, {9, 9, 4, 5, 2}};
        print(arr2);
        System.out.println("No of Rows: "+ arr2.length);
        System.out.println("No of Columns: "+ arr2[0].length);
    }
}
