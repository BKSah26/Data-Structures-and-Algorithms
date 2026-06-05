package Two_Dimensional_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth row of Pascal's Triangle: ");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i=0; i<n; i++){
            ArrayList<Integer> newarr = new ArrayList<>();
            for (int j=0; j<=i; j++){
                if (j==0 || j==i){
                    newarr.add(1);
                }
                else{
                    int val = arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
                    newarr.add(val);
                }
            }
            arr.add(newarr);
        }
        System.out.println(arr.get(n-1));
    }
}
