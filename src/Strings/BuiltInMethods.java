package Strings;

public class BuiltInMethods {
    public static void main(String[] args) {
        String s1 = "Aatish Kapoor";
        System.out.println(s1);
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.indexOf('Y')); //If char is not in the string
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        String s2 = "harshit";
        System.out.println(s2.toUpperCase());
        System.out.println(s2.contains("harsh"));
        System.out.println(s2.startsWith("harsh"));
        System.out.println(s2.endsWith("arsh"));

        //concat()
        s1.concat(s2);  //This doesn't add the string as during concatenation, a new string is created.
        System.out.println(s1);
        System.out.println(s1.concat(s2));
    }
}
