import  java.util.Scanner;

public class parImpar {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    int n, x;

    n = input.nextInt();
        
    for(int i=0; i<n; i++){
      x = input.nextInt();

      if(x == 0){
        System.out.println("NULL");
      }
      else if (x % 2 == 0){
        if(x > 0){
          System.out.println("EVEN POSITIVE");
        }
        else{
          System.out.println("EVEN NEGATIVE");
        }
      }  
      else if(x % 2 != 0){
        if (x > 0){
          System.out.println("ODD POSITIVE");
        }
        else{
          System.out.println("ODD NEGATIVE");
        }
      }
    }

   
    input.close();        
  }
}
