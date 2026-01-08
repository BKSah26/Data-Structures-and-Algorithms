package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentCharacterM2 {
    public static void main(String[] args) {
        //Sliding Window Method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        int i=0, j=0, n = arr.length;
        int maxFreq = -1;
        char maxChar = arr[0];
        while (j<n){
            if (arr[i]==arr[j]){
                j++;
            }
            else{
                int freq = j-i;
                if (freq>maxFreq){
                    maxFreq=freq;
                    maxChar=arr[i];
                }
                i=j;
            }
        }
        int freq = j-i;
        if (freq>maxFreq){
            maxFreq=freq;
            maxChar=arr[i];
        }
        System.out.println("Character with Highest Frequency: "+maxChar);
        System.out.println("Frequency: "+maxFreq);
    }
}
