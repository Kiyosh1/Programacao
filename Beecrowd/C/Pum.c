#include <stdio.h>

int main() {
  int N;
  scanf("%d", &N);

  for (int i = 0; i < N; i++) {
    printf("%d %d %d PUM\n", i * 4 + 1, i * 4 + 2, i * 4 + 3);
  }
  return 0;
}
