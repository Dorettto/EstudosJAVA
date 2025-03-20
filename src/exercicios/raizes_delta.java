package sorteio;
import java.util.Scanner;

public class Raizes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double a, b, c, delta = 0, raizA = 0, raizB = 0;
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		
		if (a == 0 || b == 0 || c == 0) {
			System.out.println("Nenhum coeficiente pode ser zero.");
		}else {
			delta = b*b-(4*a*c);
			raizA = (-b+Math.sqrt(delta))/2*a;
			raizB = (-b-Math.sqrt(delta))/2*a;
				if (delta > 0) {
					System.out.println("2 raizes reais e distintas: " + raizA +" e " +raizB);
				} else if (delta == 0) {
					System.out.println("2 raizes reais e iguais: " + raizA +" e " +raizB);
				} else {
					System.out.println("Não existem raizes reais: " + raizA +" e " +raizB);
				}
		}
		
		entrada.close();
	}

}
