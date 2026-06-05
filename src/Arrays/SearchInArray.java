package Array;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 25, 38, 21, 35, 17, 24, 47};
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Enter a no to search in the array:");
        int n = sc.nextInt();

        int flag = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==n){
                System.out.println("Searched no found.");
                System.out.println("Position: "+(i+1));
                flag = 1;
                break;
            }
        }
        if (flag==0){
            System.out.println("Searched no not found.");
        }
    }
}
