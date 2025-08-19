package exercicios1;

import java.util.Scanner;

public class CalculoQuadrado {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Escreva a medida do quadrado");
        int numero = leitura.nextInt();

        int calculoQuadrado = numero * numero;
        System.out.printf("A área do quadrado é %s\n", calculoQuadrado);


    }
}
