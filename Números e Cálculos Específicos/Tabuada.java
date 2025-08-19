import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um número e lhe direi a tabuada do mesmo até 10");
        var numero = scanner.nextInt();

        for (int i = 0; i <10 ; i++) {
            System.out.println(numero + " X " + i + " = " + numero * i);
        }
    }
}
