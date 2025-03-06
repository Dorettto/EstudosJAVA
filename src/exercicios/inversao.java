package exercicios;
import java.util.Scanner;

public class inversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero, unidade, dezena, centena;

        System.out.println("Insira um número inteiro com 3 dígitos: ");
        numero = entrada.nextInt();

        if (numero >= 1000) {
            System.out.println("Número inválido.");
        }else if (numero <= 99){
            System.out.println("Número inválido.");
        } else {
            unidade = numero%10;
            dezena = numero/10;
            dezena = dezena%10;
            centena = numero/100;
            centena = centena%10;
            System.out.println(unidade+""+dezena+""+centena);
        }
        entrada.close();

    }
}
