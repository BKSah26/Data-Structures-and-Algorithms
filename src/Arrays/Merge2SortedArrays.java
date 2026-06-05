package Array;

public class Merge2SortedArrays {
    public static void merge(int[] c, int[] a, int[] b){
        int i=0, j=0, k=0;
        while (i<a.length && j<b.length){
            if (a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if (i==a.length){
            while (j<b.length){
                c[k]=b[j];
                j++;
                k++;
            }
        }
        else {
            while (i < a.length) {
                c[k] = a[i];
                i++;
                k++;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 7, 9};
        int[] b = {2, 5, 6, 8};
        int[] c = new int[a.length+b.length];
        merge(c, a, b);

        for (int i=0; i<c.length; i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
}
