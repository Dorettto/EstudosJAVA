package exercicios;
import java.util.Scanner;

public class areas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        triangulo = (a*c)/2;
        circulo = 3.14159*(Math.pow(c, 2));
        trapezio = ((a+b)*c)/2;
        quadrado = b*b;
        retangulo = a*b;
        
        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);

        entrada.close();
    }
}
