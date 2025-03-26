package exercicios;

import java.util.Scanner;

public class verificacao_multiplos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int A, B;
        System.out.println("**Programa para verificar se dois inteiros são múltiplos**");
        System.out.println("Insira o primeiro número: ");
        A = entrada.nextInt();
        System.out.println("Insira o segundo número: ");
        B = entrada.nextInt();
        
        if (A%B==0 || B%A==0) {
            System.out.printf("%d e %d São múltiplos.", A, B);
        } else {
            System.out.printf("%d e %d Não são múltiplos", A, B);
        }
        entrada.close();
    }
}
