import java.util.Scanner;

public class testeDeSelecao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a, b, c, d, somaAB, somaCD;

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();

    somaAB = a+b;
    somaCD = c+d;

    if (b>c && d>a && somaCD > somaAB && c > 0 && d > 0 && a % 2 == 0){
      System.out.println("Valores aceitos");
    }
    else{
      System.out.println("Valores nao aceitos");
    }
    sc.close();
  }
}
