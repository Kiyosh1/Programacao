import java.util.Scanner;

public class idades {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    double idade = input.nextInt();
    double soma = 0;
    double quant =0;
    double media;

    if(idade > 0){

      while (idade > 0){
        soma += idade;
        quant += 1;
        idade = input.nextInt();
      }

      media = soma / quant;
    System.out.printf("%.2f%n",media);
    }
    input.close();
  }
}
