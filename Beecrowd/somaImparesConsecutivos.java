import java.util.Scanner;

public class somaImparesConsecutivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        int a, b, soma, maior, menor;
        a = sc.nextInt();
        b = sc.nextInt();
        
        soma = 0;

        maior = a;
        menor = b;
        if (b > maior){
            maior = b;
            menor = a;
        }


        for(int i = menor+1 ; i < maior; i++){
            if(i % 2 != 0)
                soma += i; 
            
        }
        System.out.println(soma);
        sc.close();
    }
}
