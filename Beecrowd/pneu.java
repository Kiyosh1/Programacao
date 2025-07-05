import java.util.Scanner;

public class pneu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pressaoDesejada, pressaoLida, diferenca;

        pressaoDesejada = sc.nextInt();
        pressaoLida = sc.nextInt();

        diferenca = pressaoDesejada - pressaoLida;
        

        System.out.println(diferenca);
        sc.close();
    }
}
