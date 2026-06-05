package Array;

public class SecondHighestElement {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 4, 1, 9, 6, 7, 7, 9};
        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        int smax = -1;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > smax &&  arr[i] != max){
                smax = arr[i];
            }
        }

        System.out.println("Second Largest No: "+smax);
    }
}
