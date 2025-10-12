#include <stdio.h>

int main() {
  int ref, N, dois = 0, tres = 0, quatro = 0, cinco = 0, i = 0;

  scanf("%d", &N);

  while (i < N) {
    scanf("%d", &ref);
    if (ref % 2 == 0) {
      dois += 1;
    }
    if (ref % 3 == 0) {
      tres += 1;
    }
    if (ref % 4 == 0) {
      quatro += 1;
    }
    if (ref % 5 == 0) {
      cinco += 1;
    }
    i++;
  }

  printf("%d Multiplo(s) de 2\n", dois);
  printf("%d Multiplo(s) de 3\n", tres);
  printf("%d Multiplo(s) de 4\n", quatro);
  printf("%d Multiplo(s) de 5\n", cinco);

  return 0;
}
