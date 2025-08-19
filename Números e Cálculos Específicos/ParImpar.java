import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // PRIMEIOR NUMERO
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        int numero2;

        do {
            System.out.print("Digite o segundo número (maior que o primeiro): ");
            numero2 = scanner.nextInt();
            if (numero2 <= numero1) {
                System.out.println("O segundo número deve ser maior que o primeiro!");
            }
        } while (numero2 <= numero1);

        // PAR OU IMPAR
        System.out.print("Deseja ver números pares ou ímpares? (par/impar): ");
        String escolha = scanner.next();

        System.out.println("\nNúmeros " + escolha + " no intervalo de " + numero2 + " até " + numero1 + ":");


        for (int i = numero2; i >= numero1; i--) {
            if (escolha.equals("par") && i % 2 == 0) {
                System.out.print(i + " ");
            } else if (escolha.equals("impar") && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

