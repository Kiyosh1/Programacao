import  java.util.Scanner;

public class paraEntreCinco {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    int num, pares;
    pares = 0;

    for(int i=0; i<5; i++){
      num = sc.nextInt();

      if (num % 2 == 0){
        pares += 1;
      }
    }
    System.out.printf("%d valores pares%n", pares);
    sc.close();
  }
}
