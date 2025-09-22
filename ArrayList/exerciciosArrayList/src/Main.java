import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Exercicio1 jogador1 = new Exercicio1("R7", 7);
//        Exercicio1 jogador2 = new Exercicio1("Neymar", 0);
//        Exercicio1 jogador3 = new Exercicio1("Marta", 10);
//
////        Exercicio 1 Ordenando nomes de jogadores
//        ArrayList<Exercicio1> jogadores = new ArrayList<>();
//        jogadores.add(jogador1);
//        jogadores.add(jogador2);
//        jogadores.add(jogador3);
//
//        // ORDENA EM ORDEM ALFABETICA
//        Collections.sort(jogadores);
//
//        // IMPRIMI
//        for (Exercicio1 j : jogadores){
//            System.out.println("Nome: " + j.nome + " - Nivel de habilidade: " + j.nivelHabilidade);
//        }

//        EXERCICIO 2 Inventário de loja de RPG

//        Exercicio2 arma1 = new Exercicio2("Espada");
//        Exercicio2 arma2 = new Exercicio2("Chinelo");
//        Exercicio2 arma3 = new Exercicio2("Pistola");
//
//        ArrayList<Exercicio2> armas = new ArrayList<>();
//        armas.add(arma1);
//        armas.add(arma2);
//        armas.add(arma3);
//
//        Collections.sort(armas);
//
//        for (Exercicio2 a : armas){
//            System.out.println("Arma: " + a.arma);
//        }

//        EXERCICIO 3 Criando uma lista de frutas

//        Exercicio3 fruta1 = new Exercicio3("Banana");
//        Exercicio3 fruta2 = new Exercicio3("Kiwi");
//        Exercicio3 fruta3 = new Exercicio3("Maçã");
//        Exercicio3 fruta4 = new Exercicio3("Uva");
//        Exercicio3 fruta5 = new Exercicio3("Manga");
//
//        ArrayList<Exercicio3> frutas = new ArrayList<>();
//        frutas.add(fruta1);
//        frutas.add(fruta2);
//        frutas.add(fruta3);
//        frutas.add(fruta4);
//        frutas.add(fruta5);
//
//        for (Exercicio3 f : frutas){
//            System.out.println(f.fruta);
//        }


//        EXERCICIO 4  Invertendo a ordem

//        ArrayList<Integer> number = new ArrayList<>();
//        number.add(3);
//        number.add(7);
//        number.add(23);
//
//        Collections.reverse(number);
//
////        ORDEM DECRESCENTE
//        for (Integer n : number){
//            System.out.println("Numero: " + n);
//        }

//        EXERCICIO 5. Lista de compras

        ArrayList<String> listaDeCompras = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String opcao = "";

        do {
            System.out.println("=======================");
            System.out.println("Adicionar item na lista");
            System.out.println("=======================");

            // Ler item digitado (com espaços)
            System.out.print("Digite o item: ");
            String item = scanner.nextLine();

            // Adicionar item na lista
            listaDeCompras.add(item);

            System.out.println("Item adicionado: " + item);
            System.out.print("Deseja adicionar outro item? (sim/não): ");
            opcao = scanner.nextLine().trim().toLowerCase();

        } while (opcao.equals("sim"));

        System.out.println("\nLista final de compras:");
        for (String item : listaDeCompras) {
            System.out.println("- " + item);
        }



    }
}