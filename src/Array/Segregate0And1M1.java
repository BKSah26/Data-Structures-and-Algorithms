package Array;

public class Segregate0And1M1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1};
        int nOfZero = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==0){
                nOfZero+=1;
            }
        }

        for (int i=0; i<arr.length; i++){
            if (i<nOfZero){
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
