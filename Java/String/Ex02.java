import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        char[] vogal = {'a','e','i','o','u'};
        int i,j, qntVogal=0;

        for(i=0; i<nome.length();i++){
            for(j=0;j<5;j++){
                if(nome.charAt(i) == vogal[j]){
                qntVogal += 1; 
                }
            }
        }
        System.out.println(qntVogal);
        
    }
}
