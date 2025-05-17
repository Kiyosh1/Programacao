import java.util.Scanner;
public class TempoDeJogo {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int inicio, fim,tempo;
        inicio = sc.nextInt();
        fim = sc.nextInt();
        
        if (inicio > fim ){
            tempo = 24 - inicio + fim; 
        }
        else if ( fim > inicio) {
            tempo = fim - inicio;
        }
        else{
            tempo = 24;
        }
        
        System.out.printf("O JOGO DUROU %d HORA(S)%n", tempo);
 
        sc.close();
    }
}
