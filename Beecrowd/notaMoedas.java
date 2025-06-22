import java.util.Scanner;

public class notaMoedas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double valor = sc.nextDouble();
    int resultado;

    System.out.println("NOTAS:");
    
    resultado = (int)valor / 100;
    valor %= 100;
    System.out.println(resultado + " nota(s) de R$ 100.00");

    resultado = (int)valor / 50;
    valor %= 50;
    System.out.println(resultado + " nota(s) de R$ 50.00");

    resultado = (int)valor / 20;
    valor %= 20;
    System.out.println(resultado + " nota(s) de R$ 20.00");

    resultado = (int)valor / 10;
    valor %= 10;
    System.out.println(resultado + " nota(s) de R$ 10.00");

    resultado = (int)valor / 5;
    valor %= 5;
    System.out.println(resultado + " nota(s) de R$ 5.00");

    resultado = (int)valor / 2;
    valor %= 2;
    System.out.println(resultado + " nota(s) de R$ 2.00");
    

    valor *= 100;

    System.out.println("MOEDAS");

    resultado = (int)valor / 100;
    System.out.println(resultado + " moeda(s) de R$ 1.00");
    valor %= 100;
   
    resultado = (int)valor / 50;
    System.out.println(resultado + " moeda(s) de R$ 0.50");
    valor %= 50;

    resultado = (int)valor / 25;
    System.out.println(resultado + " moeda(s) de R$ 0.25");
    valor %= 25;

    resultado = (int)valor / 10;
    System.out.println(resultado + " moeda(s) de R$ 0.10");
    valor %= 10;

    resultado = (int)valor / 5;
    System.out.println(resultado + " moeda(s) de R$ 0.05");
    valor %= 5;

    resultado = (int)valor / 1;
    System.out.println(resultado + " moeda(s) de R$ 0.01");


    sc.close();
  }
}
