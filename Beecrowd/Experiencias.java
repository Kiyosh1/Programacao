import java.util.Scanner;
 
public class Experiencias {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int numCasos, rato, sapo, coelho, quantCobaias, total;
        float pC, pS, pR;
        rato = 0;
        sapo = 0;
        coelho = 0;
        quantCobaias = 0;
        total = 0;
        char tipo;

        numCasos = sc.nextInt();

        for(int i=0; i<numCasos; i++){
            quantCobaias = sc.nextInt();

            tipo = sc.next().charAt(0);

            if(tipo == 'C')
                coelho += quantCobaias;
            if(tipo == 'R')
                rato += quantCobaias;
            if(tipo == 'S')
                sapo += quantCobaias;

            total += quantCobaias;
            
        }
        pC = (float)coelho * 100 / total;
        pS = (float)sapo* 100 / total;
        pR = (float)rato * 100 / total;

        System.out.println("Total: "+ total + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f %%%n", pC);
        System.out.printf("Percentual de ratos: %.2f %%%n" ,pR);
        System.out.printf("Percentual de sapos: %.2f %%%n", pS);
        sc.close();
    }
}
