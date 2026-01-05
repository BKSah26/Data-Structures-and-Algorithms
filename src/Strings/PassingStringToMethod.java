package Strings;

public class PassingStringToMethod {
    public static void change(String string){
        string = "Aatish";
        System.out.println(string);
    }

    public static void main(String[] args) {
        String str = "Bipin";
        System.out.println(str);
        change(str);
        System.out.println(str);
    }
}
