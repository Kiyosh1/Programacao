import java.util.Scanner;

public class ddd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int ddd = sc.nextInt();
    String local;

    switch (ddd){
      case 61:
        local = "Brasilia";
        break;
      case 71:
        local = "Salvador";
        break;
      case 11:
        local = "Sao Paulo";
        break;
      case 21:
        local = "Rio de Janeiro";
        break;
      case 32:
        local = "Juiz de Fora";
        break;
      case 19:
        local = "Campinas";
        break;
      case 27:
        local = "Vitoria";
        break;
      case 31:
        local = "Belo Horizonte";
        break;
      default:
        local = "DDD nao cadastrado";
    }

    System.out.println(local);
    sc.close();
  }
}
