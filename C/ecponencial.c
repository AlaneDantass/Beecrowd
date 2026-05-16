#include <stdio.h>
int exponencial(int valor, int expoente) {
	int contador = 0;
    int resultado = 1; 
    
    while(contador < expoente) {
        resultado *= valor;
        contador++;
    }
    return resultado;
}

int main()
{

	int valor,expoente;
	
	printf("Digite um valor: ");
	scanf("%d",&valor);
	
	printf("Digite o expoente: ");
	scanf("%d",&exponente);

	int resultadoFinal = exponencial(valor,expoente);
	printf("O resultado C): %d", resultadoFinal);
	
	return 0;
}