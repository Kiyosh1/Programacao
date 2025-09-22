#include <stdio.h>

int main() {
  double codigo, quantidade;

  scanf("%lf", &codigo);
  scanf("%lf", &quantidade);

  if (codigo == 1) {
    codigo = 4.00;
  } else if (codigo == 2) {
    codigo = 4.50;
  } else if (codigo == 3) {
    codigo = 5.00;
  } else if (codigo == 4) {
    codigo = 2.00;
  } else {
    codigo = 1.50;
  }
  printf("Total: R$ %.2lf\n", codigo * quantidade);
}
