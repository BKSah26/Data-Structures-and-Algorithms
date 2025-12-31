package Two_Dimensional_Array;

public class SnakePatternColumnWise {
    public static void main(String[] args) {
        int[][] arr = {{6, 0, 2, 7, 6}, {1, 3, 7, 2, 2}, {9, 9, 4, 5, 2}};

        for (int i=0; i<arr[0].length; i++){
            if (i%2==0){
                for (int j=0; j<arr.length; j++){
                    System.out.print(arr[j][i]+" ");
                }
            }
            else {
                for (int j=arr.length-1; j>=0; j--){
                    System.out.print(arr[j][i]+" ");
                }
            }
        }
    }
}
