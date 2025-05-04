import java.util.Scanner;

public class Ex03{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j;

        int[][] mat = new int[8][8];

        for(i=0; i<8; i++){
            for(j=0; j<8; j++){
                    mat[i][j] = 0;
                if(i == j)
                    mat[i][j] = 1;
                if(i > j)
                    mat[i][j] = 1;
            }
        }
        
        for(i=0; i<8; i++){
            for(j=0; j<8; j++){
            System.out.print(mat[i][j] + " | ");
            }
            System.out.println();
        }
        
    }
}
