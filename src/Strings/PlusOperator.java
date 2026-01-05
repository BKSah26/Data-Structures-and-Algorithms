package Strings;

public class PlusOperator {
    public static void main(String[] args) {
        String s1 = "Anushka";
        String s2 = "Gautam";

        s1+=" ";
        s1+=s2;
        s1+=" ";
        s1+=12;
        s1+='A';
        System.out.println(s1);

        System.out.println("Aatish"+10+20); //Output will not be Aatish30, it will be Aatish1020.
        System.out.println(10+20+"Aatish");
        System.out.println(10+"Aatish"+20);
        System.out.println("Aatish"+(10+20));
        System.out.println('A'+4+"Aatish"); //This will print 69Aatish.
    }
}
