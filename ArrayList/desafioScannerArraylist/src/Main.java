import java.util.ArrayList;
import java.util.Scanner;
// o toLowerCase() transforma a resposta em letras minúsculas
// trim() remove espaços extras no início ou fim da resposta

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String opcao = "";

        do {
            System.out.println("Adicione o item na lista:");
            // Lê o item digitado
            String item = scanner.next();
            // Adiciona o item à lista
            lista.add(item);

            System.out.println("Item adicionado! Lista atual: " + lista);
            System.out.println("Deseja adicionar outro item? (sim/não)");

            opcao = scanner.next().trim().toLowerCase();
        } while(opcao.equals("sim"));

        System.out.println("Lista final: " + lista);
    }
}