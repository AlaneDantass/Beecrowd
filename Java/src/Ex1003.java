import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        input.close();
    }
}