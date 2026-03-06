import java.util.Scanner;
public class Ex1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        double volume = (4.0/3) * 3.14159 * Math.pow(value,3);

        System.out.printf ("VOLUME = %.3f", volume);
        scanner.close();
    }
}
