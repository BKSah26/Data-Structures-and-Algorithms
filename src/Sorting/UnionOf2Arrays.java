package Sorting;

import java.util.ArrayList;

public class UnionOf2Arrays {
    public static void print(ArrayList<Integer> arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void addval(ArrayList<Integer> array, int val){
        if ((array.size()==0) || array.get((array.size()-1))!=val){
            array.add(val);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 5, 7, 8, 9};
        int[] b = {1, 2, 3, 6, 6, 9};

        ArrayList<Integer> arr = new ArrayList<>();
        int i=0, j=0;
        while (i<a.length && j<b.length){
            if (a[i]<b[j]){
                addval(arr, a[i]);
                i++;
            }
            else if(a[i]>b[j]){
                addval(arr, b[j]);
                j++;
            }
            else{
                addval(arr, a[i]);
                i++;
                j++;
            }
        }
        while (i<a.length){
            addval(arr, a[i]);
            i++;
        }

        while (j<b.length){
            addval(arr, b[j]);
            j++;
        }
        print(arr);
    }
}
