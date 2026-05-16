#include <stdio.h>
void aumentoSalarial(float *salario){ //o ponteiro sempre é usado quando se quer trabalhar diretamente com o valor indo direto ao seu endereço
    *salario += 500;
    printf("o novo salário será %.f\n", *salario);
    /*perceba que se eu esquecer de colocar o * ele vai retornar o endereço e não o valor, pois nessa função, o que era apenas variável entrou como sendo u
    m ponteiro, ou seja, o valor da variável é acessado por meio do endereço, e o ponteiro é a variável que armazena esse endereço.*/

}

int main()
{
    float salario;
    printf("Digite seu salário atual: ");
    scanf("%f",&salario);
    //aqui precisa dizer o endereço para que o ponteiro acesse ele
    aumentoSalarial(&salario);
    printf("Salário: %.f", salario);
    

    return 0;
}
