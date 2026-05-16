/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main(){
    int A[2][3] = {{1,2,3},{4,5,6}};
    int B[3][2] = {{7,8},{9,10},{11,12}};
    
    int At[3][2]; 
    int Bt[3][2];
    
    for (int i = 0; i< 2; i++){
        for(int j = 0; j<3; j++){
            At[j][i]=A[i][j];
            
        }
    }
    for (int i = 0; i< 3; i++){
        for(int j = 0; j<2; j++){
            Bt[i][j]=B[j][i];
        }
    }
    
    int linhasA = sizeof(At)/sizeof(At[0]);
    int colunasA =  sizeof(At[0])/sizeof(At[0][0]);
    int elementosA = sizeof(At)/sizeof(At[0][0]);
    
        
    int linhasB = sizeof(Bt)/sizeof(Bt[0]);
    int colunasB =  sizeof(Bt[0])/sizeof(Bt[0][0]);
    int elementosB = sizeof(Bt)/sizeof(Bt[0][0]);
    
    printf("Matriz A\n");
    for(int i = 0; i < linhasA; i++){
        for(int j=0;j< colunasA; j++){
            printf("%d",At[i][j]);
        }printf("\n");
    }
    
    printf("%d linhas,", linhasA);
    printf("%d colunas,",colunasA);
    printf("e %d elementos",elementosA);
    
    printf("\nMatriz B\n");
    for(int i = 0; i < linhasB; i++){
        for(int j=0;j<colunasB; j++){
            printf("%d", Bt[i][j]);
        }printf("\n");
    }
    
    printf("%d linhas", linhasB);
    printf("%d colunas",colunasB);
    printf("%d elementos",elementosB);
    return 0;
    
}