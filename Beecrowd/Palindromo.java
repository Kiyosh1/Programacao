import java.util.Scanner;

public class Palindromo {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = "";
        

        for(int i=0; i<str.length(); i++){
            reverse = str.charAt(i) + reverse;
        }

        if(str.equals(reverse))
            System.out.println("Eh palindromo");
        else
            System.out.println("Nao eh palindromo");
    }
}
