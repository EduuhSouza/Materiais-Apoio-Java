package exercicios1;

import java.util.Scanner;

public class IdadeDiferenca {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Escreva a sua idade");

//        SCANNER DAS DUAS IDADES
        int idade = numero.nextInt();
        System.out.println("Escreva a idade de alguém e lhe direi qual a diferença de idade entre vocês");
        int idade2 = numero.nextInt();

        int diferenca = idade - idade2;
        System.out.printf("A diferenca entre as idades é %s anos\n", diferenca);


    }
}
