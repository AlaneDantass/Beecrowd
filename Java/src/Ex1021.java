import java.util.Scanner;
public class Ex1021 {
    public static void main(String[] args) {
        //Nunca use double para dinheiro diretamente. Use BigDecimal ou int (representando centavos) para evitar problemas de precisão.
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        int inteiro =  (int) (n*100);  // Convertendo para centavos
    
        System.out.println(inteiro);
        System.out.println(inteiro/10000 + " nota(s) de R$ 100.00");
        System.out.println(inteiro%10000/5000 + " nota(s) de R$ 50.00");
        System.out.println(inteiro%10000%5000/2000 + " nota(s) de R$ 20.00");
        System.out.println(inteiro%10000%5000%2000/1000 + " nota(s) de R$ 10.00");
        System.out.println(inteiro%10000%5000%2000%1000/500 + " nota(s) de R$ 5.00");
        System.out.println(inteiro%10000%5000%2000%1000%500/200 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", inteiro%10000%5000%2000%1000%500%200/100);
        System.out.printf("%d moeda(s) de R$ 0.50\n", inteiro%10000%5000%2000%1000%500%200%100/50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", inteiro%10000%5000%2000%1000%500%200%100%50/25);
        System.out.printf("%d moeda(s) de R$ 0.10\n",inteiro%10000%5000%2000%1000%500%200%100%50%25/10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", inteiro%10000%5000%2000%1000%500%200%100%50%25%10/5);
        System.out.printf("%d moeda(s) de R$ 0.01\n", inteiro%10000%5000%2000%1000%500%200%100%50%25%10%5/1);
        input.close();
        //Atenção : o erro aqui foi na ordem das operações para converter para interiro. O correto é multiplicar por 100 antes de converter para inteiro, para evitar perda de precisão.

    }
}
