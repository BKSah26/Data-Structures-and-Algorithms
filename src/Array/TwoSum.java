package Array;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 5, 2, 9, 8};
        System.out.print("Enter the desired sum:");
        int n = sc.nextInt();

        int found = 0;
        for (int i=0; i<arr.length; i++){
            int sum = 0;
            for (int j=i+1; j<arr.length; j++){
                sum=arr[i]+arr[j];
                if (sum==n){
                    found = 1;
                    System.out.println("Pairs found!");
                    System.out.println("Values are: "+arr[i]+" and "+arr[j]);
                }
            }
        }
        if (found == 0){
            System.out.println("Pairs not found!");
        }
    }
}
