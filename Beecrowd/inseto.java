import java.util.Scanner;

public class inseto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int energia = sc.nextInt();

            if(energia > 8000){
                System.out.println("Mais de 8000!");
            }else{
                System.out.println("Inseto!");
            }
        }
    }
}
