package exercicios;

import java.util.Scanner;

public class adivinhe_numero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aleatorio = (int)(Math.random()*10+1), chute;
            do {
                System.out.println("Chute um número de 0 a 10 (3 chances)");
                chute = entrada.nextInt();
                    if (chute == aleatorio) {
                        System.out.println("Você Acertou!");
                        break;
                    }else if (chute > aleatorio){
                        System.out.println("Chutou alto! Tente Novamente!");
                    }else if (chute < aleatorio){
                        System.out.println("Chutou baixo! Tente novamente!");
                    }
                System.out.println("Chute um número de 0 a 10 (2 chances)");
                chute = entrada.nextInt();
                    if (chute == aleatorio) {
                        System.out.println("Você Acertou!");
                        break;
                    }else if (chute > aleatorio){
                        System.out.println("Chutou alto! Tente Novamente!");
                    }else if (chute < aleatorio){
                        System.out.println("Chutou baixo! Tente novamente!");
                    }
                System.out.println("Chute um número de 0 a 10 (1 chance)");
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
