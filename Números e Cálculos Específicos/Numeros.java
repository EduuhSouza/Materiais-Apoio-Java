import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número");
        var numero = scanner.nextInt();

        while (true){
            System.out.println("Informe o número para verificação");
            var verificacao = scanner.nextInt();
            if (verificacao < numero){
                System.out.printf("Informe um número maior que %s \n", numero);
                continue;
            }

            var resultado = verificacao % numero;
            System.out.printf("%s %% %s = %s \n", verificacao, numero, resultado);
            if (resultado != 0) break;
        }
    }
}
