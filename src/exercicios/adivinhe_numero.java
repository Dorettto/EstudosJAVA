package sorteio;
import java.util.Scanner;

public class Jogo_Adivinha {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int chute = 0;
		int max = 10;
        int aleatorio = (int)(Math.random()*max+1);
            do {
                System.out.println("Chute um número de 1 a " +max+ " (3 chances)");
                chute = entrada.nextInt();
                    if (chute == aleatorio) {
                        System.out.println("Você Acertou!");
                        break;
                    }else if (chute > aleatorio){
                        System.out.println("Chutou alto! Tente Novamente!");
                    }else if (chute < aleatorio){
                        System.out.println("Chutou baixo! Tente novamente!");
                    }
                System.out.println("Chute um número de 1 a " +max+ " (2 chances)");
                chute = entrada.nextInt();
                    if (chute == aleatorio) {
                        System.out.println("Você Acertou!");
                        break;
                    }else if (chute > aleatorio){
                        System.out.println("Chutou alto! Tente Novamente!");
                    }else if (chute < aleatorio){
                        System.out.println("Chutou baixo! Tente novamente!");
                    }
                System.out.println("Chute um número de 1 a " +max+ " (1 chance)");
                chute = entrada.nextInt();
                    if (chute == aleatorio) {
                        System.out.println("Você Acertou!");
                        break;
                    }else {
                        System.out.println("Errou! Suas chances acabaram!");
                        break;
                }
            } while (chute != aleatorio);
            System.out.printf("O número secreto era %d.", aleatorio);
            entrada.close();

	}

}
