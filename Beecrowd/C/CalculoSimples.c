#include <stdio.h>

int main() {

  int qnt1, codigo1;
  double preco1;

  int qnt2, codigo2;
  double preco2;

  scanf("%d", &codigo1);
  scanf("%d", &qnt1);
  scanf("%lf", &preco1);

  scanf("%d", &codigo2);
  scanf("%d", &qnt2);
  scanf("%lf", &preco2);

  printf("VALOR A PAGAR: R$ %.2lf\n", qnt1 * preco1 + qnt2 * preco2);

  return 0;
}
