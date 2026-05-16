#include <stdio.h>

void mudar(int* a, int* b){
    int  x = *a;
    *a = *b;
    *b = x;
}

int main()
{
    int a = 10;
    int b = 20;
    printf("'A' antes %d \n'B' antes %d\n",a,b);
    mudar(&a,&b);
    
    printf("A = %d\nB = %d",a,b);


}