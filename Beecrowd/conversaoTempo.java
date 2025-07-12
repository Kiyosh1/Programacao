import java.util.Scanner;

public class conversaoTempo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int segundo, minuto, hora;

    segundo = sc.nextInt();
    hora = segundo / 3600;
    segundo = segundo % 3600;

    minuto = segundo / 60;
    segundo = segundo % 60;

    System.out.printf("%d:%d:%d\n", hora, minuto, segundo);
    sc.close();
  }
}
