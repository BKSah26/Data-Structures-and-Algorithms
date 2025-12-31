package Two_Dimensional_Array;

import java.util.ArrayList;

public class MinimumOfRowMaximums {
    public static void main(String[] args) {
        int[][] arr = {{6, 0, 2, 7, 6}, {1, 3, 7, 2, 2}, {9, 9, 4, 5, 2}};
        ArrayList<Integer> maxvals = new ArrayList<>();

        for (int i=0; i<arr.length; i++){
            int max = arr[i][0];
            for (int j=0; j<arr[0].length; j++){
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
            maxvals.add(max);
        }

        int min = maxvals.get(0);
        for (int ele : maxvals){
            if (ele<min){
                min = ele;
            }
        }
        System.out.println("Smallest Element: "+min);
    }
}
