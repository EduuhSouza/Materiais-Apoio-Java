import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // EXERCICIO 1 ORDENANDO NUMEROS EM ORDEM CRESCENTE = ALURA
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(2);
//        numbers.add(9);
//        numbers.add(1);
//        numbers.add(5);
//        numbers.add(6);
//
//        Collections.sort(numbers);
//        System.out.println(numbers);


//        // EXERCICIO 2 CLASSE TITULO
//        Title name1 = new Title("Eduarda");
//        Title name2 = new Title("Júlia");
//        Title name3 = new Title("Nathalia");
//        Title name4 = new Title("Rodrigo");
//        Title name5 = new Title("Maria");
//
//        // EXERCICIO 3 continuação do exercicio 2
//
//        ArrayList<Title> names = new ArrayList<>();
//        names.add(name1);
//        names.add(name2);
//        names.add(name3);
//        names.add(name4);
//        names.add(name5);
//
//        Collections.sort(names);
//        for (Title t : names){
//            System.out.println(t.name);
//        }

        // EXERCICIO 4

        List<String> list = new LinkedList<>();
        list.add("fruta");
        list.add("bola");
        list.add("cachorro");

        List<String> list2 = new ArrayList<>();
        list2.add("gato");
        list2.add("bolo");
        list2.add("chave");

        System.out.println("Lista 1: " + list);
        System.out.println("Lista 2: " + list2);


    }
}