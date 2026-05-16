/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

void troca (char *letra){
    char aux = *letra;
    *letra = 'z';
}
int main()
{
    char l;
    printf("Digite uma letra: ");
    scanf("%c",&l);
    
    troca(&l);
    printf("%c", l);


    return 0;
}
