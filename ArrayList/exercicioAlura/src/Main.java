import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Objetos das pessoas e o construtor
        Pessoa pessoa = new Pessoa("Eduarda", 20);
        Pessoa pessoa2 = new Pessoa("Júlia", 20);
        Pessoa pessoa3 = new Pessoa("Kiki", 1);

        // Criando a ArrayList
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        // O size serve para mostrar o tamanho/ quantidade de objetos na lista
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        // O get(0) serve para mostrar o primeira objeto adicionado
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0).nome + listaDePessoas.get(0).idade);

        // Imprime a lsita toda
        System.out.println(listaDePessoas);


    }
}