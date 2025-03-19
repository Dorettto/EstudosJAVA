package exercicios;

import java.util.Scanner;

public class conversaoSegundos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int N, horas, minutos, segundos;

        System.out.println("Insira o tempo em segundos: ");
        N = entrada.nextInt();
 
        // conversão de segundos em horas, minutos e segundos
        horas = N/3600;
        minutos = N/60;
        minutos = minutos%60;
        segundos = N%60;
        
        System.out.println("Tempo total: "+horas+ " hora(s), " +minutos+ " minuto(s) e " +segundos+" segundo(s)");
        
        entrada.close();
    }
}
