package exercicios;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero;

        System.out.println(">Programa Tabuada<");
        System.out.println("Insira a seguir o número da tabuada:");
        numero = entrada.nextInt();

        System.out.println(numero + " x 1 = " + (1*numero));
        System.out.println(numero + " x 2 = " + (2*numero));
        System.out.println(numero + " x 3 = " + (3*numero));
        System.out.println(numero + " x 4 = " + (4*numero));
        System.out.println(numero + " x 5 = " + (5*numero));
        System.out.println(numero + " x 6 = " + (6*numero));
        System.out.println(numero + " x 7 = " + (7*numero));
        System.out.println(numero + " x 8 = " + (8*numero));
        System.out.println(numero + " x 9 = " + (9*numero));
        System.out.println(numero + " x 10 = " + (10*numero));

        entrada.close();
    }
}
