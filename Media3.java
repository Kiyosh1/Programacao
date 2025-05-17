import.util.java.Scanner;
public class Media3{
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, n4, media, notaExame;

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();
        notaExame = 0;
  
        media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10;

        System.out.printf("Media: %.1f%n", media - 0.01);
        
        if (media >= 5 && media <= 6.9){
        System.out.println("Aluno em exame.");
        notaExame = sc.nextDouble();

        System.out.println("Nota do exame: " + notaExame);
        media = (media + notaExame) / 2; 
            if(media >= 5){
                System.out.println("Aluno aprovado.");
            }
            else{
                System.out.println("Aluno reprovado.");
            }
                System.out.println("Media final: " + media);
        }
        else if(media >= 7){
            System.out.println("Aluno aprovado.");
        }
        else{
            System.out.println("Aluno reprovado.");
        }
    sc.close();
    }
