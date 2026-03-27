
import java.util.Arrays;
import java.util.Scanner;

public class Ex1042 {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int A, B, C;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();

        int[] numbers = {A, B, C};
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        input.close();
    }
    
}