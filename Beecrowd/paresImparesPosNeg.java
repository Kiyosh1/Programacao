import java.util.Scanner;

public class paresImparesPosNeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  
        int num,par, impar, pos, neg;

        par = 0;
        impar = 0;
        pos = 0;
        neg = 0;

        for(int i=0; i<5; i++){
            num = input.nextInt();
            if(num % 2 == 0){
              par += 1;
            }
            if(num % 2 != 0){
              impar += 1;
            }
            if(num > 0){
              pos += 1;
            }
            if(num < 0){
              neg += 1;
            }
        }
        System.out.printf("%d valar(es) par(es)%n",par);
        System.out.printf("%d valar(es) impar(es)%n",impar);
        System.out.printf("%d valar(es) positivo(s)%n",pos);
        System.out.printf("%d valar(es) negativo(s)%n",neg);
        input.close();
    }
}
