import java.util.Scanner;

public class idadeDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano, mes, dia;

        dia = sc.nextInt();
        
        ano = dia / 365;
        dia = dia % 365;

        mes = dia / 30;
        dia = dia % 30;

        System.out.println("ano " + ano);
        System.out.println("mes " + mes);
        System.out.println("dias " + dia);

        sc.close();
    }
}
