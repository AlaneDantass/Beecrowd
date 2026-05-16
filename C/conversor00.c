#include<stdio.h>
int main(){
    int segundos;
    printf("Digite um valor em segundos: ");
    scanf("%d", &segundos);

    int horas = segundos /3600;
    int minutos = segundos/60;
    printf("Horas: %d\n", horas);
    printf("Minutos: %d\n", minutos);
    return 0;
}