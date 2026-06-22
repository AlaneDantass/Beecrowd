#include <stdio.h>

int main() {
  int tentativa;
  do {
    scanf("%d", &tentativa);
    if (tentativa == 2002) {
      printf("Acesso Permitido\n");
      break;
    } else {
      printf("Senha Invalida\n");
    }
  } while (tentativa != 2002);

  return 0;
}