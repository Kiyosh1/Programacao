import java.util.Scanner;

public class Idade{
    public static void verificarIdade(int idade) throws Exception{

        if(idade < 18){
            throw new Exception("Idade tem que ser maior que 18 anos ");
        }else{
            System.out.println("Idade valida para dirigir!");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();

            verificarIdade(idade);
        }catch (Exception e ){
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();
    }
}
