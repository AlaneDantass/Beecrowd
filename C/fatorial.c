#include <stdio.h>
int fatorial(int numero){

    if(numero<=1){
        return 1;
    }
    return numero * fatorial(numero-1); 
}
    
int main()
{
    int numero;
    printf("Digite um valor: ");
    scanf("%d", &numero);
    
    int resultado = fatorial(numero);
    
    printf("O fatorial de  %d é: %d\n", numero, resultado);
    
    return 0;
}