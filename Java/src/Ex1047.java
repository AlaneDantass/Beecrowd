import java.util.Scanner;
public class Ex1047 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int StartTime = input.nextInt();
        int StartMinute = input.nextInt();
        
        int endTime = input.nextInt();
        int endMinute = input.nextInt();

        
        int hours = (endTime - StartTime);

        if (hours == 0 && StartMinute == endMinute){
            hours = 24;
        }

        if (hours < 0){
            hours = hours + 24;
        }

        int minutes = (endMinute - StartMinute)+(hours*60);

        if (minutes <= 0){
            minutes += 1440;
        }
        
        int Tot = minutes;
        
        System.out.println("O JOGO DUROU "+ Tot/60 + " HORA(S) E "+Tot%60 + " MINUTO(S)");
        input.close();
        }
    }

