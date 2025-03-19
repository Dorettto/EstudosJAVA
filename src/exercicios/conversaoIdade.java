package exercicios;

import java.util.Scanner;

public class conversaoIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int idade, anos, meses, dias;

        System.out.println("Insira a idade em dias: ");
        idade = entrada.nextInt();
        
        // convertendo a uma idade em anos, meses e dias:
        anos = idade/365;
        meses = (idade%365)/30;
        dias = (idade%365)%30;
        
        System.out.println(anos+" ano(s)");
        System.out.println(meses+" mes(es)");
        System.out.println(dias+" dia(s)");
        
        entrada.close();
    }
    
}
