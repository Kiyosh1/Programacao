#include <stdio.h>

int main() {
  char nome[20];
  double salario, vendas;

  scanf("%s", nome);
  scanf("%lf", &salario);
  scanf("%lf", &vendas);

  if (vendas == 0) {
    printf("TOTAL = R$ %.2lf\n", salario);
  } else {
    printf("TOTAL = R$ %.2lf\n", salario + (vendas * 0.15));
  }

  return 0;
}
