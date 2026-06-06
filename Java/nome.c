/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby,
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include<string.h>

void input(char nome[], int n) {
	printf("Digite se nome: ");
	fgets(nome,n,stdin);
	printf("Seu nome é %s",nome);
	

}

int main()
{
    char nome[100];
	input(nome, 100);
	return 0;
}