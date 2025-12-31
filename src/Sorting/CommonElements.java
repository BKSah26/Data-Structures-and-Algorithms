package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 1, 1, 4, 5, 5, 5};
        int[] b = {6, 1, 1, 4, 4, 2, 8};

        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> c = new ArrayList<>();

        int i=0, j=0;
        while (i<a.length && j<b.length){
            if (a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                c.add(a[i]);
                i++;
                j++;
            }
        }

        System.out.println(c);
    }
}
