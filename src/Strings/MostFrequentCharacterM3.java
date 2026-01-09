package Strings;

import java.util.Scanner;

public class MostFrequentCharacterM3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int n = s.length();
        int[] arr = new int[26];
        for (int i=0; i<n; i++){
            char ch = s.charAt(i);
            int index = (int)ch-97;
            arr[index]+=1;
        }

        int maxFreq = -1;
        char ans = s.charAt(0);

        for (int i=0; i<arr.length; i++){
            if (arr[i]>maxFreq){
                maxFreq=arr[i];
                ans = (char)(i+97);
            }
        }

        System.out.println("Most repeated character: "+ans);
        System.out.println("Frequency: "+maxFreq);
    }
}
