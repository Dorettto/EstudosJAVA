package exercicios;

import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		int numero;
		for (int i = 0; i<5; i++) {
			System.out.println("Insira um número");
			numero = entrada.nextInt();
			if (numero % 2 == 0) {
				System.out.printf("O número %d é par\n", numero);
                break;
			} else {
				System.out.printf("O número %d é ímpar\n", numero);
                break;
			}
			}
		entrada.close();
    }
    
}
