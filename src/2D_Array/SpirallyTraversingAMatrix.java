package Two_Dimensional_Array;

public class SpirallyTraversingAMatrix {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}, {19, 20, 21, 22, 23, 24}, {25, 26, 27, 28, 29, 30}};
        int fr=0, lr= array.length-1, fc=0, lc=array[0].length-1;
        while (fr<=lr && fc<=lc){
            for (int j = fc; j<=lc; j++){
                System.out.print(array[fr][j]+" ");
            }
            fr++;

            if (fr>lr || fc>lc){
                break;
            }

            for (int i=fr; i<=lr; i++){
                System.out.print(array[i][lc]+" ");
            }
            lc--;

            if (fr>lr || fc>lc){
                break;
            }

            for (int j=lc; j>=fc; j--){
                System.out.print(array[lr][j]+" ");
            }
            lr--;

            if (fr>lr || fc>lc){
                break;
            }

            for (int i=lr; i>=fr; i--){
                System.out.print(array[i][fc]+" ");
            }
            fc++;

            if (fr>lr || fc>lc){
                break;
            }
        }
    }
}
