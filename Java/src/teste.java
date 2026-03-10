import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();

    
        System.out.println(n);
        System.out.printf("%.0f nota(s) de R$ 100,00\n", n/100);
        System.out.printf("%.0f nota(s) de R$ 50,00", n%100/50);
        System.out.printf("%.0f nota(s) de R$ 20,00", n%100%50/20);
        System.out.printf("%.0f nota(s) de R$ 10,00", n%100%50%20/10);
        System.out.printf("%.0f nota(s) de R$ 5,00", n%100%50%20%10/5);
        System.out.printf("%.0f nota(s) de R$ 2,00", n%100%50%20%10%5/2);
        System.out.printf("%.0f nota(s) de R$ 1,00", n%100%50%20%10%5%2);

        input.close();

    }
}
