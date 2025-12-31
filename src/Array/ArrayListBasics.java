package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        System.out.println(arr.get(2));
        arr.set(3, 50);
        System.out.println(arr.get(3));
        System.out.println(arr);

        int n = arr.size();
        for (int i=0; i<n; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        arr.add(2, 26);
        System.out.println(arr);

        arr.remove(5);
        arr.remove(arr.size()-1);
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);

        int i = 0;
        int j = arr.size()-1;
        while (i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);

        ArrayList<Character> chararr = new ArrayList<>();
        chararr.add('O');
        chararr.add('S');
        chararr.add('C');
        chararr.add('A');
        chararr.add('R');
        System.out.println(chararr);
    }
}
