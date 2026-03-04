import java.util.Scanner;
public class Ex1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hours = scanner.nextInt();
        double valuePerHour = scanner.nextDouble(); //deve enviar com vírgula, ex: 15,50

        double salary = hours * valuePerHour;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);
    }
}
