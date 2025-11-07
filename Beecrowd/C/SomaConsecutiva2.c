
#include <stdio.h>

int main() {
  int N;
  int X, Y;
  int i;
  int j;
  int soma;
  int min, max;

  scanf("%d", &N);

  for (i = 0; i < N; i++) {

    scanf("%d %d", &X, &Y);

    soma = 0;

    if (X < Y) {
      min = X;
      max = Y;
    } else {
      min = Y;
      max = X;
    }

    for (j = min + 1; j < max; j++) {

      if (j % 2 != 0) {
        soma = soma + j;
      }
    }

    printf("%d\n", soma);
  }

  return 0;
}
