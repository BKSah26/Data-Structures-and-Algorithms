package Strings;

public class Equality {
    public static void main(String[] args) {
        String str1 = "Aatish";
        String str2 = new String("Aatish");
        String str3 = "Aatish";

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        //Output 1 will be false, but output 2 will be true.
        //This happens because although all the three strings are the same, but str2 is created in a new memory space, while str3 points to the same memory space as str1.
        //Hence, str1==str3 prints true, but str1==str2 prints false.

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        //This inbuilt function helps overcome this problem.
    }
}
