package Two_Dimensional_Array;

public class ReverseRowsIn2DArray {
    public static void print(int[][] arr){
        for (int[] array : arr){
            for (int ele : array){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{6, 0, 2, 7, 6}, {1, 3, 7, 2, 2}, {9, 9, 4, 5, 2}};

        for (int i=0; i<arr.length; i++){
            int j=0, k=arr[0].length-1;
            while (j<k){
                int temp = arr[i][j];
                arr[i][j]=arr[i][k];
                arr[i][k]=temp;
                j++;
                k--;
            }
        }

        print(arr);
    }
}
