#include <stdio.h>

int main() {
  int n;
  scanf("%d", &n);
  int valor;
  for (int i = 0; i < n; i++) {
    scanf("%d", &valor);
    if (valor < 0 && valor % 2 == 0) {
      printf("EVEN NEGATIVE\n");
    } else if (valor > 0 && valor % 2 == 0) {
      printf("EVEN POSITIVE\n");
    } else if (valor > 0 && valor % 2 != 0) {
      printf("ODD POSITIVE\n");
    } else if (valor < 0 && valor % 2 != 0) {
      printf("ODD NEGATIVE\n");
    } else {
      printf("NULL\n");
    }
  }
  return 0;
}