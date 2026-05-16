/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

float areaCirculo(float raio){
    float area = (raio * raio)* 3.14;
    printf("A área é: %f",area);
    return area;
}

int main()
{
    float raio;
    printf("Digite o raio: ");
    scanf("%f",&raio);
    
    areaCirculo(raio);
    return 0;
}