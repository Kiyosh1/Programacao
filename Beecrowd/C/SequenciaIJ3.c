#include <stdio.h>

int main() {

  int i, j, j_inicial;
  for (i = 1; i <= 9; i += 2) {
    j_inicial = i + 6;
    for (j = j_inicial; j >= (j_inicial - 2); j--) {
      printf("I=%d J=%d\n", i, j);
    }
  }

  return 0;
}
