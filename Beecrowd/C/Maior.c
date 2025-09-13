#include <stdio.h>
#include <stdlib.h>

int main() {

  int a, b, c;
  int maior, maiorAB;
  int absolutoAB = 0, absolutoAC = 0;

  scanf("%d", &a);
  scanf("%d", &b);
  scanf("%d", &c);

  absolutoAB = abs(a - b);
  maiorAB = (a + b + absolutoAB) / 2;

  absolutoAC = (abs(maiorAB - c));
  maior = ((maiorAB + c + absolutoAC) / 2);

  printf("%d eh o maior\n", maior);
  return 0;
}
