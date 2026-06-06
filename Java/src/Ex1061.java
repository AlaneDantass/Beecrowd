import java.util.Scanner;

public class Ex1061 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String lixo; // Variável para ignorar o texto "Dia" e os ":"

        // --- ENTRADA DOS DADOS DE INÍCIO ---
        // Esperado: Dia 9
        lixo = leitor.next(); 
        int dInicio = leitor.nextInt();
        
        // Esperado: 06 : 13 : 23
        int hourI = leitor.nextInt();
        lixo = leitor.next(); // consome o ":"
        int minI = leitor.nextInt();
        lixo = leitor.next(); // consome o ":"
        int segI = leitor.nextInt();

        // --- ENTRADA DOS DADOS DE FIM ---
        lixo = leitor.next(); 
        int dFinal = leitor.nextInt();
        
        int hourF = leitor.nextInt();
        lixo = leitor.next(); 
        int minF = leitor.nextInt();
        lixo = leitor.next(); 
        int segF = leitor.nextInt();

        // --- LÓGICA DE CÁLCULO ---
        // Transformamos tudo para long para evitar problemas de limite (overflow), 
        // embora para 30 dias o int suporte bem.
        long inicioEmSegundos = (dInicio * 86400L) + (hourI * 3600L) + (minI * 60L) + segI;
        long finalEmSegundos = (dFinal * 86400L) + (hourF * 3600L) + (minF * 60L) + segF;

        long totSeg = finalEmSegundos - inicioEmSegundos;

        // --- DECOMPOSIÇÃO DO TEMPO ---
        long dias = totSeg / 86400;
        long resto = totSeg % 86400;

        long horas = resto / 3600;
        resto = resto % 3600;

        long minutos = resto / 60;
        long segundos = resto % 60;

        // --- SAÍDA ---
        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        leitor.close();
    }
}