import java.util.Scanner;

public class positovosMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double num, media, soma;
        int quant;

        soma = 0;
        quant = 0;
        for(int i=0; i<6; i++){
          num = sc.nextDouble();
          if(num > 0){
            quant += 1;
            soma += num;            
          }
            
        }
        media = soma / quant;
        System.out.printf("%d valores positivos%n", quant);
        System.out.println(media);
        sc.close();
    }
}
