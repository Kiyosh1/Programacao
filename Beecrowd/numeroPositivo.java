import java.util.Scanner;

public class numeroPositivo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    double num, positivo;
    positivo = 0;

    for (int i=0; i<6; i++){
      num = input.nextDouble();
      if(num > 0)
        positivo += 1;
    }
      
    System.out.printf("%.0f valores positivos%n", positivo);
    input.close();
  }
}
