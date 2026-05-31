#include <stdio.h>
 
int main() {
    double imposto;
    double salario;
    double exedente;
    scanf("%lf",&salario);
    if(salario<=2000.00){
        printf("Isento\n");
    }else if(salario>2000.01 && salario<=3000){
        imposto=0.08*(salario-2000.00)  ;
        printf("R$ %.2f\n",imposto);
    }else if(salario>3000.01 && salario<=4500){
        exedente = salario-3000.00;//Não é resto de divisão
        imposto = 80+(0.18*exedente);
        printf("R$ %.2f\n",imposto);
    }else if(salario>4500.01){
        exedente = salario-4500.00;//Não é resto de divisão
        imposto = 80+270+(0.28*exedente);
        printf("R$ %.2f\n",imposto);
    }
    return 0;

}