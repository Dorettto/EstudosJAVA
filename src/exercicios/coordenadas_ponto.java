package exercicios;

import java.util.Scanner;

public class coordenadas_ponto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double x, y;
        System.out.println("***Programa para encontrar coordenadas de um ponto***");
        System.out.println("Digite a coordenada do Ponto X: ");
        x = entrada.nextDouble();
        System.out.println("Digite a coordenada do Ponto Y: ");
        y = entrada.nextDouble();
        
        if (x==0 && y==0){
            System.out.println("O ponto se encontra na Origem.");
        } else if (x==0 && y!=0) {
            System.out.println("O ponto se encontra no Eixo Y.");
        } else if (x!=0 && y==0) {
            System.out.println("O ponto de encontra no Eixo X.");
        } else if (x>0 && y>0){
            System.out.println("O ponto de encontra no Quadrante 1.");
        } else if (x<0 && y>0){
            System.out.println("O ponto de encontra no Quadrante 2.");
        } else if (x<0 && y<0){
            System.out.println("O ponto de encontra no Quadrante 3.");
        } else if (x>0 && y<0){
            System.out.println("O ponto de encontra no Quadrante 4.");
        }
        entrada.close();
    }
    
}
