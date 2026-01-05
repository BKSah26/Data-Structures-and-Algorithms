package Strings;

public class BuiltInCompareTo {
    public static void main(String[] args) {
        String s1 = "raghav";
        String s2 = "preet";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));

        String s3 = "harmeet";
        String s4 = "harsh";
        System.out.println(s3.compareTo(s4));
        System.out.println(s4.compareTo(s3));

        //If one string is exactly equal to other, but length of one string is more, then the difference of the strings is printed in the compare to function.
        String s5 = "Harshit";
        String s6 = "Harsh";
        System.out.println(s5.compareTo(s6));
        System.out.println(s6.compareTo(s5));
    }
}
