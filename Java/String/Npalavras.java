import java.util.Scanner;

public class Npalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print("qual sera a quantidade de palavras? ");
        int N = sc.nextInt(); 

        System.out.print("Qual a primeria letra da palavra? ");
        char ch = sc.next().charAt(0);

        String[] PalavrasComALetra = new String[N];

        sc.nextLine(); // limpeza de buffer 
        System.out.println("Digite as palavras com a letra " + ch);


        for(i=0; i<N; i++){
            String x = sc.nextLine();
            while(x.charAt(0) != ch){
            System.out.println("Valor invalido: ");    
            x = sc.nextLine();
            }
            PalavrasComALetra[i] = x;
        }
        System.out.println("Palavras com a letra " + ch);
        for(i=0;i<N; i++){
            System.out.print(PalavrasComALetra[i] + " | ");
        }
        
    }
}
