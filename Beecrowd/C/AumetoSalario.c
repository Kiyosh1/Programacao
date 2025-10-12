#include <stdio.h>

int main() {
  double salario, novoSalario, reajuste;
  int percentual;

  scanf("%lf", &salario);

  if (salario <= 400) {
    novoSalario = salario * 1.15;
    reajuste = salario * 0.15;
    percentual = 15;
  } else if (salario <= 800) {
    novoSalario = salario * 1.12;
    reajuste = salario * 0.12;
    percentual = 12;
  } else if (salario <= 1200) {
    novoSalario = salario * 1.10;
    reajuste = salario * 0.10;
    percentual = 10;
  } else if (salario <= 2000) {
    novoSalario = salario * 1.07;
    reajuste = salario * 0.07;
    percentual = 7;
  } else {
    novoSalario = salario * 1.04;
    reajuste = salario * 0.04;
    percentual = 4;
  }

  printf("Novo salario: %.2lf\n", novoSalario);
  printf("Reajuste ganho: %.2lf\n", reajuste);
  printf("Em percentual: %d %%\n", percentual);
}
