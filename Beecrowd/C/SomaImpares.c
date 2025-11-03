#include <stdio.h>

int main() {
  int X, Y;
  int soma = 0;
  int i;
  int min, max;

  scanf("%d", &X);
  scanf("%d", &Y);

  if (X < Y) {
    min = X;
    max = Y;
  } else {
    min = Y;
    max = X;
  }

  for (i = min + 1; i < max; i++) {

    if (i % 2 != 0) {
      soma = soma + i;
    }
  }
  printf("%d\n", soma);

  return 0;
}
