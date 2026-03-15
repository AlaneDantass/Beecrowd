import java.util.Scanner;
public class Ex1040{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double N1, N2, N3, N4;
        N1 = input.nextDouble();
        N2 = input.nextDouble();
        N3 = input.nextDouble();
        N4 = input.nextDouble();

        double media = ((2*N1) + (3*N2) + (4*N3) + (1*N4))/10.0;
        media = ((int)(media * 10)) / 10.0;
            
        System.out.printf("Media: %.1f\n", media);
        if( media >= 7.0){
            System.out.println("Aluno aprovado.");
        }else if(media<5.0){
            System.out.println("Aluno reprovado.");
        }else if (media >= 5.0 && media <= 6.9){
            System.out.println("Aluno em exame.");
            double exame = input.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", exame);
            media = ((media + exame) / 2.0);
            media = ((int)(media * 10)) / 10.0;
            if(media >= 5.0){
                System.out.println("Aluno aprovado.");
            }else if (media <= 4.9){
                System.out.println("Aluno reprovado.");
            }
        }
        System.out.printf("Media final: %.1f\n", media);
    input.close();
    }
}

