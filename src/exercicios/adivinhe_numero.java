package sorteio;
import java.util.Scanner;

public class Jogo_Adivinha {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int chute = 0, max = 10;
        int aleatorio = (int)(Math.random()*max+1);
        int chances = 0;
        
        System.out.println("***Programa sorteia números***");
        	do {
        		System.out.println("Inicializar digite um número de 1 a " +max);
        		chute = entrada.nextInt();
        	} while (chute <1 || chute > max);
        	
        	for (chances = 0; chances < 3; chances ++) {
        		System.out.println("Chute um número de 1 a " +max);
        		chute = entrada.nextInt();
        			if (chute == aleatorio) {
        				System.out.println("Você Acertou!");
        				break;
        			}else if (chute > aleatorio){
        				System.out.println("Chutou alto!");
        			}else if (chute < aleatorio){
                    System.out.println("Chutou baixo!");
        			}
                }
        	if (chances == 3) {
        		System.out.println("Suas tentativas acabaram!");
        		System.out.printf("O número secreto era %d.", aleatorio);
        	} else {
            System.out.printf("O número secreto era %d.", aleatorio);
        	}
            entrada.close();
	}
}

}
