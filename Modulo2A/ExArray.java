public class ExArray {
    
    public static void main(String[] args) {
        
        /*int[] nota = {9,10,8};
        
        //nota[0] = 9;
        //nota[1] = 10;
        //nota[2] = 8;

        for(int val:nota){
            System.out.println(val);
        }*/    
        
        //int matriz[][], i, j;
        int[][] matriz;
        int i,j;
        matriz = new int[2][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.println(matriz[i][j]);
            }
        }


    }

}
