package Strings;

import java.util.Scanner;

public class MostFrequentCharacterM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int n = s.length();
        int maxFrequency = -1;
        char maxChar = s.charAt(0);

        for (int i=0; i<n; i++){
            char ch = s.charAt(i);
            int freq = 1;
            for (int j=i+1; j<n; j++){
                if (s.charAt(j)==ch){
                    freq+=1;
                }
            }
            if (freq>maxFrequency){
                maxFrequency = freq;
                maxChar = ch;
            }
            else if(freq==maxFrequency && ch<maxChar){
                maxChar = ch;
            }
        }

        System.out.println("Character with Highest Frequency: "+maxChar);
        System.out.println("Frequency: "+maxFrequency);
    }
}
