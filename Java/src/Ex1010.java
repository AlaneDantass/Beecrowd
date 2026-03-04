import java.util.Scanner;
public class Ex1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int code1 = input.nextInt();             
        int quantity1 = input.nextInt();
        double price1 = input.nextDouble();
        int code2 = input.nextInt();
        int quantity2 = input.nextInt();
        double price2 = input.nextDouble();

        double valueTot = quantity1* price1 + quantity2*price2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valueTot); 
        input.close();
    }
}