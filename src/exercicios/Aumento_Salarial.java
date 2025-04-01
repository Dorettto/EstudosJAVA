package exercicios;

import java.util.Scanner;

public class Aumento_Salarial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, reajuste, novoSalario;
        
        System.out.println("**Programa Aumento de Salário**");
        System.out.println("Insira seu salário a seguir para descobrir seu aumento:");
        salario = entrada.nextDouble();
         if (salario <= 400.00 && salario >=0){
             reajuste = salario*0.15;
             novoSalario = salario+reajuste;
             System.out.printf("Novo salario: %.2f\n", novoSalario);
             System.out.printf("Reajuste ganho: %.2f\n", reajuste);
             System.out.println("Em percentual: 15 %");
         } else if (salario >= 400.01 && salario <= 800.00){
             reajuste = salario*0.12;
             novoSalario = salario+reajuste;
             System.out.printf("Novo salario: %.2f\n", novoSalario);
             System.out.printf("Reajuste ganho: %.2f\n", reajuste);
             System.out.println("Em percentual: 12 %");
         } else if (salario >= 800.01 && salario <= 1200.00){
             reajuste = salario*0.10;
             novoSalario = salario+reajuste;
             System.out.printf("Novo salario: %.2f\n", novoSalario);
             System.out.printf("Reajuste ganho: %.2f\n", reajuste);
             System.out.println("Em percentual: 10 %");
         } else if (salario >= 1200.01 && salario <= 2000.00){
             reajuste = salario*0.07;
             novoSalario = salario+reajuste;
             System.out.printf("Novo salario: %.2f\n", novoSalario);
             System.out.printf("Reajuste ganho: %.2f\n", reajuste);
             System.out.println("Em percentual: 7 %");
         } else {
             reajuste = salario*0.04;
             novoSalario = salario+reajuste;
             System.out.printf("Novo salario: %.2f\n", novoSalario);
             System.out.printf("Reajuste ganho: %.2f\n", reajuste);
             System.out.println("Em percentual: 4 %");
         }
         entrada.close();
    }
}
