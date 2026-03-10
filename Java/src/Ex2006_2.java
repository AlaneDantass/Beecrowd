import java.util.Scanner;

public class Ex2006_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int type = input.nextInt();
        int[] numbers = new int[5];  // cria um array para A, B, C, D, E
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt(); // lê os 5 números
        }

        int quantity = 0;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] == type) {
                quantity++; // incrementa se acertou
            }
        }

        System.out.println("Acertaram " + quantity);
        input.close();
    }
}