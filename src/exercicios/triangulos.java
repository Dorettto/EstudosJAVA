package exercicios;

import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double a, b, c;
		System.out.println("Digite os três lados do triângulo: ");
		
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();
		
		if ((a<b+c)&&(b<a+c)&&(c<a+b)) {
			if (a==b && b==c){
			System.out.println("É um triangulo Equilátero.");
			} else {
				if (a==b || a==c || c==b) {
					System.out.println("É um triangulo Isósceles.");
				} else {
					System.out.println("É um triangulo Escaleno.");
				}
			}
		} else {
			System.out.println("Não é um triângulo.");
		}
		entrada.close();

	}

}
