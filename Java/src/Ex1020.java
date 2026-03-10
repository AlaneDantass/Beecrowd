import java.util.Scanner;
public class Ex1020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int age = input.nextInt();
        
        System.out.println(age/365+" ano(s)");
        System.out.println((age%365)/30+" mes(es)");
        System.out.println((age%365)%30+" dia(s)");
        input.close();
    }
}
