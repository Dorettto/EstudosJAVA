package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int A, B, C;
        System.out.println("**Meu primeiro programa com Arrays**");
        System.out.println("Insira 3 números: ");
        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        
        int[] myNum = {A, B, C};
        Arrays.sort(myNum);
        for (int i : myNum) {
        System.out.println(i);
        }
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        
        entrada.close();
    }
}