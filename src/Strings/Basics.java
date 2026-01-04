package Strings;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] name = {'B', 'i', 'p', 'i', 'n'};
        for (char ele : name){
            System.out.print(ele+"");
        }
        System.out.println();

        String fullname = "Bipin Kumar Sah";
        System.out.println(fullname);

        System.out.print("Enter name: ");
        String str1 = sc.nextLine();
        System.out.println(str1);

        System.out.print("Enter name: ");
        String str2 = sc.next();
        System.out.println(str2);
    }
}
