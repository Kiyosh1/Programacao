#include <stdio.h>

int main() {
  int N, count = 0;
  double media = 0;

  do {
    scanf("%d", &N);
    if (N >= 0) {
      count += 1;
      media += N;
    }
  } while (N >= 0);

  printf("%.2lf\n", media / count);

  return 0;
}
