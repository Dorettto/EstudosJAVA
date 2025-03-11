package exercicios;

import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        double y, calculo;
        
        x = entrada.nextInt();
        y = entrada.nextDouble();
        
        calculo = x/y;
        System.out.printf("%.3f km/l\n", calculo);
        entrada.close();
    }
}
