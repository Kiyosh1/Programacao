import java.util.Scanner;
 
public class TopN {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int posicao = 0;

        if(N == 1){
            posicao = 1;
        }
        else if(N <= 3){
            posicao = 3;
        }
        else if(N <= 5){
            posicao = 5;
        }
        else if(N <= 10){
            posicao = 10;
        }
        else if(N <= 25){
            posicao = 25;
        }
        else if(N <= 50){
            posicao = 50;
        }
        else if(N <= 100){
            posicao = 100;
        }
        System.out.println("Top " + posicao);
 
    }
 
}
