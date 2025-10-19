#include <stdio.h>

int main() {
  int p, codigo, quantidade, i;
  double total = 0.0;

  double precos[5] = {1.50, 2.50, 3.50, 4.50, 5.50};

  scanf("%d", &p);

  for (i = 0; i < p; i++) {
    scanf("%d %d", &codigo, &quantidade);

    switch (codigo) {
    case 1001:
      total += quantidade * 1.50;
      break;
    case 1002:
      total += quantidade * 2.50;
      break;
    case 1003:
      total += quantidade * 3.50;
      break;
    case 1004:
      total += quantidade * 4.50;
      break;
    case 1005:
      total += quantidade * 5.50;
      break;
    }
  }
  printf("%.2f\n", total);

  return 0;
}
