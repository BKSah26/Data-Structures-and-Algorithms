package Recursion;

public class FunctionCallingItself {
    public static void main(String[] args){
        call(1);
    }
    public static void call(int n){
        if (n==5){
            return;
        }
        System.out.println("Hello World!");
        call(n+1);
    }
}
