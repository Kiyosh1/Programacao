import java.util.Scanner;

public class validacaoNota {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double n1, n2, media;

      n1 = input.nextDouble();
      while(n1 < 0 || n1 > 10){
          System.out.println("nota invalida");
          n1 = input.nextDouble();
      }
      n2 = input.nextDouble();
      while(n2 < 0 || n2 > 10){
          System.out.println("nota invalida");
          n2 = input.nextDouble();
      }

      media = (n1 + n2)/2;
      System.out.printf("media = %.2f%n", media);
        input.close();
  }
}
