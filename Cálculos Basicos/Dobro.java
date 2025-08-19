package alura.exercicios;

import java.util.Scanner;

public class Calculadora {
    void dobro(){
        System.out.println("Escreva um número e lhe darei o dobro");

        Scanner calculadora = new Scanner(System.in);
        int numeros = calculadora.nextInt();

        numeros *= 2;

        System.out.println("O dobro é " + numeros);
    }
}
