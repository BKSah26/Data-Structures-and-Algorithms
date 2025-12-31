package Two_Dimensional_Array;

import java.util.ArrayList;

public class TwoDimensionalArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(5);
        a.add(5);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(3);
        b.add(5);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(5);
        c.add(7);
        c.add(11);

        ArrayList<Integer> d = new ArrayList<>();
        d.add(2);
        d.add(4);
        d.add(6);
        d.add(12);
        d.add(6);
        d.add(8);
        d.add(10);
        d.add(4);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);

        System.out.println(arr);
    }
}
