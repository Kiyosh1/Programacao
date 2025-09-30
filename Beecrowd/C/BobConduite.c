#include <stdio.h>

int main() {
  int n, r1, r2, conduite;
  scanf("%d", &n);

  for (int i = 0; i < n; i++) {
    scanf("%d", &r1);
    scanf("%d", &r2);

    conduite = r1 + r2;
    printf("%d\n", conduite);
  }
}
