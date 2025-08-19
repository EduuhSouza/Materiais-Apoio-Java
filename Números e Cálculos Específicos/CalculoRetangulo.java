package exercicios1;

import java.util.Scanner;

public class CalculoRetangulo {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Escreva a base do retângulo");
        var base = numero.nextDouble();

        System.out.println("Escreva a altura do retângulo");
        var altura = numero.nextDouble();

        var area = base * altura;
        System.out.printf("A área do seu retângulo é %s\n", area);

    }
}
