import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso em Kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua  em centimetros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu imc é " + imc);

        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9){
            System.out.println("Peso ideal");
        } else if (imc <= 29.9){
            System.out.println("Levemente acima do peso");
        } else if (imc <=  34.9){
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9){
            System.out.println("Obesidade Grau II (Severa)");
        } else if (imc <= 40.0){
            System.out.println("Obesidade III (Mórbida)");
        }
    }
}
