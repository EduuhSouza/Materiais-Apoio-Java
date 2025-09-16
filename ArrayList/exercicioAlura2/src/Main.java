import exercicioAnimal.Animal;
import exercicioAnimal.Cachorro;
import exercicioproduto.Produto;
import exerciciosContaBancaria.ContaBancaria;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        EXERCICIO 1
//        ArrayList<String> lista = new ArrayList<>();
//        lista.add("Eu");
//        lista.add("Xulia");
//        lista.add("Nanath");
//
//        for (String l : lista){
//            System.out.println(l);
//        }

//        EXERCICIO 2 - ANIMAL

//        Cachorro dog = new Cachorro();
//
//        Animal animal = (Animal) dog;
//
//        ArrayList<Animal> listaAnimais = new ArrayList<>();
//        listaAnimais.add(animal);

//        EXERCICIO 3 - ANIMAL
//
//        for (Animal a : listaAnimais){
//            a.fazerSom();
//
//            if (a instanceof Cachorro){
//                Cachorro cao = (Cachorro) a;
//                cao.fazerSom();
//            }
//        }

//        EXERCICIO 4 - PRODUTO
//        Produto p = new Produto("Camiseta", 89.99);
//        Produto p2 = new Produto("Funko Deadpool", 1.99);
//        Produto p3 = new Produto("Funko Rodrigo", 101.99);
//
//        ArrayList<Produto> listaProdutos = new ArrayList<>();
//        listaProdutos.add(p);
//        listaProdutos.add(p2);
//        listaProdutos.add(p3);
//
//        double soma = 0;
//        for (Produto produto : listaProdutos){
//            soma += p.preco;
//        }
//
//        double media = soma / listaProdutos.size();
//        System.out.println("Media de preço: " + media);

//        EXERCICIO CONTA BANCARIA
        ContaBancaria conta1 = new ContaBancaria(123, 2.89);
        ContaBancaria conta2 = new ContaBancaria(666, 666.66);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);

        for (ContaBancaria c : contas){
            System.out.println("Numero da conta: " + c.getNumeroDaConta() + " Saldo: " + c.getSaldo());
        }

        System.out.println("============================");
        System.out.println("Conta com maior saldo");

        ContaBancaria maiorSaldo = contas.get(0);
        for (ContaBancaria conta : contas){
            if (conta.getSaldo() > maiorSaldo.getSaldo()){
                System.out.println(conta);
            }
        }



    }
}