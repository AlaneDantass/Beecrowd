import java.util.Scanner;
public class Ex1018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
    
        System.out.println(n);
        System.out.println(n/100 + " nota(s) de R$ 100,00");
        System.out.println(n%100/50 + " nota(s) de R$ 50,00");
        System.out.println(n%100%50/20 + " nota(s) de R$ 20,00");
        System.out.println(n%100%50%20/10 + " nota(s) de R$ 10,00");
        System.out.println(n%100%50%20%10/5 + " nota(s) de R$ 5,00");
        System.out.println(n%100%50%20%10%5/2 + " nota(s) de R$ 2,00");
        System.out.println(n%100%50%20%10%5%2 + " nota(s) de R$ 1,00");

        //vc pode usar o operador % para calcular o resto da divisão e assim obter a quantidade de cada nota, por exemplo:
        //int notas100 = n / 100;
        //int resto = n % 100;
        //int notas50 = resto / 50;
        //e assim por diante para as outras notas.
        /*Quando se usa n%100%50/20, o primeiro %100 calcula o resto da divisão por 100, ou seja, o valor que sobra depois de 
        retirar as notas de 100. O segundo %50 calcula o resto da divisão por 50, ou seja, o valor que sobra depois de retirar 
        as notas de 50. E assim por diante para as outras notas. Dessa forma, você consegue calcular a quantidade de cada nota 
        necessária para compor o valor total n.*/

        input.close();
    }
}
