#include <stdio.h>

int main(int argc, char *argv[]) {
  int count = 1;

  for (int i = 1; i <= 100; i++) {
    if (i % 2 == 0) {
      printf("%d\n", i);
    }
  }
  return 0;
}
