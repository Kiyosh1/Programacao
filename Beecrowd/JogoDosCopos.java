import java.util.Scanner;

public class JogoDosCopos {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        

        char posicao = sc.next().charAt(0);
        

        for (int i = 0; i < N; i++) {
            int movimento = sc.nextInt();
            
            if (movimento == 1) { 
                if (posicao == 'A') {
                    posicao = 'B';
                } else if (posicao == 'B') {
                    posicao = 'A';
                }
            } else if (movimento == 2) {

                if (posicao == 'B') {
                    posicao = 'C';
                } else if (posicao == 'C') {
                    posicao = 'B';
                }
            } else if (movimento == 3) {

                if (posicao == 'A') {
                    posicao = 'C';
                } else if (posicao == 'C') {
                    posicao = 'A';
                }
            }
        }

        System.out.println(posicao);

        sc.close();
    }
}
