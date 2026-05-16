#include <stdio.h>
int main(){
    int opcao;
    printf("Qual o formato de conversão deseja realizar? \n");
    printf("1 - hora para minutos e segundos \n");
    printf("2 - minutos para horas e segundos \n");
    printf("3 - segundos para horas e minutos \n");
    scanf("%d", &opcao);

    int valor;
    printf("digite o valor a ser convertido: \n");
    scanf("%d", &valor);

    switch(opcao){
        case 1:
            printf("%d horas equivalem  a %d minutos e %d segundos \n", valor, valor*60, valor*3600);
            break;
        case 2:
            printf("%d minutos equivalem a %d horas e %d segundos \n", valor, valor/60, valor*60);
            break;
        case 3:            
        printf("%d segundos equivalem a %d horas e %d minutos \n", valor, valor/3600, (valor%3600)/60);
            break;
        default:
            printf("Opção inválida!\n");
    }
}