import java.util.Scanner;

public class cedulas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cem, cinquenta, vinte, dez, cinco, dois, um;
    
    um = sc.nextInt();
    cem = um / 100;
    um %= 100;

    cinquenta = um / 50;
    um %= 50;

    vinte = um / 20;
    um %= 20;

    dez = um / 10;
    um %= 10;
    
    cinco = um / 5;
    um %= 5;

    dois = um / 2;
    um %= 2;

    System.out.printf("%d nota(s) de R$ 100,00%n", cem);
    System.out.printf("%d nota(s) de R$ 50,00%n", cinquenta);
    System.out.printf("%d nota(s) de R$ 20,00%n", vinte);
    System.out.printf("%d nota(s) de R$ 10,00%n", dez);
    System.out.printf("%d nota(s) de R$ 5,00%n", cinco);
    System.out.printf("%d nota(s) de R$ 2,00%n", dois);
    System.out.printf("%d nota(s) de R$ 1,00%n", um);
    
    sc.close();
  }
}
