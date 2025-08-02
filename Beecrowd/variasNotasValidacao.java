import java.util.Scanner;
public class variasNotasValidacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resp;

        do{
            double media;

                 double n1 = sc.nextDouble();
            while(n1 < 0 || n1 > 10){
                System.out.println("nota invalida");
                n1 = sc.nextDouble();
            }
                 double n2 = sc.nextDouble();
            while(n2 < 0 || n2 > 10){
                System.out.println("nota invalida");
                n2 = sc.nextDouble();
            }

            media = (n1 + n2)/2;
            System.out.printf("media = %.2f%n", media);
            System.out.println("novo calculo (1-sim 2-nao)");

            resp = sc.nextInt(); 
            while(resp < 0 || resp > 2){
                System.out.println("novo calculo (1-sim 2-nao)");
                resp = sc.nextInt(); 
            }

        } while(resp != 2);
        sc.close();
    }
}
