import java.util.Scanner;

public class TipoCombustivel{
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
                
        int x, alcool, gasolina, diesel;
        alcool = 0;
        gasolina = 0;
        diesel = 0;

        x = input.nextInt();  

        while (x != 4){
            switch (x){
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
            }
            x = input.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        input.close();
 
    }
}
