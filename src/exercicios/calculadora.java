package exercicios;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
		int opcao;
		double x,y,resultado = 0;
		String menu = "\n1.Soma. \n2.Subtração. \n3.Multiplicação. \n4.Divisão. \n5.Raiz Quadrada. \n6.Exponenciação. \n0.Sair.";
		
		System.out.println("Escolha entre as opções: " + menu);
		opcao = entrada.nextInt();
		
		switch (opcao) {
		case 0:
			System.out.printf("Até logo!");
			break;
		case 1:
			System.out.println("Cálculo de Soma:");
			System.out.println("Digite o primeiro número: ");
			x = entrada.nextDouble();
			System.out.println("Digite o segundo número: ");
			y = entrada.nextDouble();
			resultado = x + y;
			System.out.printf("O resultado da soma é %.2f", resultado);
			break;
		case 2:
			System.out.println("Cálculo de Subtração:");
			System.out.println("Digite o primeiro número: ");
			x = entrada.nextDouble();
			System.out.println("Digite o segundo número: ");
			y = entrada.nextDouble();
			resultado = x - y;
			System.out.printf("O resultado da subtração é %.2f", resultado);
			break;
		case 3:
			System.out.println("Cálculo de Multiplicação:");
			System.out.println("Digite o primeiro número: ");
			x = entrada.nextDouble();
			System.out.println("Digite o segundo número: ");
			y = entrada.nextDouble();
			resultado = x * y;
			System.out.printf("O resultado da multiplicação é %.2f", resultado);
			break;
		case 4:
			System.out.println("Cálculo de Divisão:");
			System.out.println("Digite o primeiro número: ");
			x = entrada.nextDouble();
			System.out.println("Digite o segundo número: ");
			y = entrada.nextDouble();
			if(x == 0) {
				System.out.println("Não é possível efetuar divisão por zero.");
			}if(y == 0) {
				System.out.println("Não é possível efetuar divisão por zero.");
			}else {
			resultado = x/y;
			System.out.printf("O resultado da divisão é %.2f", resultado);
			}
			break;
		case 5:
			System.out.println("Cálculo de Raiz Quadrada:");
			System.out.println("Digite o número a ser extraída a raiz: ");
			x = entrada.nextDouble();
			if (x <= -1) {
				System.out.println("Não é possível obter a Raiz Quadrada de números negativos.");
			}else {
			resultado = Math.sqrt(x);
			System.out.printf("O resultado da Raiz Quadrada é %.2f", resultado);
			}
			break;
		case 6:
			System.out.println("Cálculo de Exponenciação:");
			System.out.println("Digite o número base: ");
			x = entrada.nextDouble();
			System.out.println("Digite o expoente: ");
			y = entrada.nextDouble();
			resultado = Math.pow(x, y);
			System.out.printf("O resultado da exponenciação é %.2f", resultado);
			break;
			}
            entrada.close();

    }
}
