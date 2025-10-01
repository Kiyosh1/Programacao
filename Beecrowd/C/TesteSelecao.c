#include <stdio.h>

int main() {
  int a, b, c, d;
  int somaCD, somaAB;

  scanf("%d", &a);
  scanf("%d", &b);
  scanf("%d", &c);
  scanf("%d", &d);

  somaCD = (c + d);
  somaAB = (a + b);

  if ((b > c && d > a) && (somaCD > somaAB) && (c > 0 && d > 0) &&
      (a % 2 == 0)) {
    printf("Valores aceitos\n");
  } else
    printf("Valores nao aceitos\n");

  return 0;
}
