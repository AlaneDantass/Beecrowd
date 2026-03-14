import java.util.Scanner;
public class Ex1040{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A, B, C, D;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        D = input.nextDouble();
            
        double media = (((2*A) + (3*B) + (4*C) + (1*D))*10/10.00);
        media = Math.round(media ) / 10.0;

        System.out.printf("Media: %.1f", media);
        if( media >= 7.0){
            System.out.println("\nAluno aprovado.");
        }else if(media<5.0){
            System.out.println("Aluno reprovado.");
        }else if (media >= 5.0 && media <= 6.9){
            System.out.println("\nAluno em exame.");
            double exame = input.nextDouble();
            System.out.printf("Nota do exame: %.1f", exame);
            media = ((media + exame) / 2.00);
            media = Math.round(media *10) / 10.0 ;
            if(media >= 5.0){
                System.out.println("\nAluno aprovado.");
            }else if (media <= 4.9){
                System.out.println("\nAluno reprovado.");
            }
        }
        System.out.printf("Media final: %.1f", media);
    input.close();
    }
}

