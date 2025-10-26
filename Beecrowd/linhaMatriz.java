import java.util.Scanner;
public class linhaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        double S = 0; 
        double M = 0;

        double[][] mat = new double[12][12];

        int L = sc.nextInt(); 

        char T = sc.next().charAt(0);

        for(i = 0; i < 12; i++){
            for(j = 0; j < 12; j++){
                mat[i][j] = sc.nextDouble(); 
            }
        }

        for(i = 0; i < 12; i++){
            S += mat[L][i];
            M += mat[L][i];
        }

        if(T == 'S'){
            System.out.printf("%.1f\n", S);
        }
        else if (T == 'M'){ 
            M = M / 12.0;
            System.out.printf("%.1f\n", M);
        }

        sc.close();
    }
}
