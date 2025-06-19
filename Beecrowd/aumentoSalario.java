import java.util.Scanner;

public class aumentoSalario {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double salarioAtual, novoSalario, reajuste, percentual;
    String porcento = "%";
    
    salarioAtual = input.nextDouble();

    if (salarioAtual <= 400){
      novoSalario = salarioAtual * 1.15  ;
      reajuste = novoSalario - salarioAtual;
      percentual = 15;
    }
    else if (salarioAtual <= 800){
      novoSalario = salarioAtual * 0.12 + salarioAtual;
      reajuste = novoSalario - salarioAtual;
      percentual = 12;
    }
    else if (salarioAtual <= 1200){
      novoSalario = salarioAtual * 0.10 + salarioAtual;
      reajuste = novoSalario - salarioAtual;
      percentual = 10;
    }
    else if (salarioAtual <= 2000){
      novoSalario = salarioAtual * 0.07 + salarioAtual;
      reajuste = novoSalario - salarioAtual;
      percentual = 7;
    }
    else {
      novoSalario = salarioAtual * 0.04 + salarioAtual;
      reajuste = novoSalario - salarioAtual;
      percentual = 4;
    }

    System.out.printf("Novo salario: %.2f%n", novoSalario);
    System.out.printf("Reajuste ganho: %.2f%n", reajuste);
    System.out.printf("Em percentual: %.0f %s%n", percentual, porcento);
    input.close();

  }
}
