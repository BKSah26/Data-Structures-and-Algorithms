package Array;

public class Segregate0And1M2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1};
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if (arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
            if (i>j){
                break;
            }
            if (arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }

        for (i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
