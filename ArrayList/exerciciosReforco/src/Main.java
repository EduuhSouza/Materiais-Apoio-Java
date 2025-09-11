import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.nio.channels.FileLock;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

//        EXERCICIO 1 LISTA DE PRODUTOS
//        Produto produto = new Produto("Funko pop Ellie, The Last of Us ", 80.99);
//        Produto produto2 = new Produto("Funko pop Deadpol ", 70.59);
//        Produto produto3 = new Produto("Funko pop Anya, Spy x Family ", 89.99);

//        ArrayList<Produto> produtos = new ArrayList<>();
//        produtos.add(produto);
//        produtos.add(produto2);
//        produtos.add(produto3);
//
//        System.out.println("================");
//        System.out.println("Tamanho da lista " + produtos.size() + " itens");
//
//        System.out.println("================");

//        IMPRIMI A LSITA TODA
//        for(Produto p : produtos){
//            System.out.println(p);
//        }
//        System.out.println("================");

//        MAIOR PRECO
//        Produto maisCaro = produtos.get(0);
//
//        for (Produto p : produtos){
//            if (p.preco > maisCaro.preco){
//                System.out.println(p);
//            }
//        }
//        System.out.println("================");
//        System.out.println("\n Produto mais caro: " + maisCaro);

//        EXERCICIO 2 LISTA DE LIVROS
//        Livro livro1 = new Livro("Lady Killers", "Tori Telfer", 2017);
//        Livro livro2 = new Livro("Manga Naruto", "Algum japones ai", 2010);
//        Livro livro3 = new Livro("Manga aleatorio", "Algum loko ai", 2005);
//
//        ArrayList<Livro> livros = new ArrayList<>();
//        livros.add(livro1);
//        livros.add(livro2);
//        livros.add(livro3);
//
//        for (Livro l : livros){
//            System.out.println(l);
//        }
//
//        System.out.println("_____________________");
//        System.out.println("Livros lançados após 2010:");
//
//        for (Livro l : livros){
//            if (l.anoPublicacao > 2010){
//                System.out.println(l);
//            }
//        }


//        EXERCICIO 3 LISTA DE ALUNOS

//        Aluno aluno1 = new Aluno("Eduarda", 8.9);
//        Aluno aluno2 = new Aluno("Júlia", 5);
//        Aluno aluno3 = new Aluno("Nathalia", 3);
//
//        ArrayList<Aluno> alunos = new ArrayList<>();
//        alunos.add(aluno1);
//        alunos.add(aluno2);
//        alunos.add(aluno3);
//
//        double soma = 0;
//        for (Aluno aluno : alunos){
//            soma += aluno.nota;
//        }
//        double media = soma / alunos.size();
//        System.out.println("Média de notas: " + media);
//
//        System.out.println("----------------------");
//        System.out.println("Alunos aprovados");
//
//        for (Aluno aluno : alunos){
//            if (aluno.nota >= 7){
//                System.out.println(aluno);
//            }
//        }

//        EXERCICIO 4 LISTA DE CARROS
//        Carro carro = new Carro("Mustang", 1969, "Vermelho");
//        Carro carro2 = new Carro("Kombi", 2000, "Branco");
//        Carro carro3 = new Carro("Onix", 2015, "Preto");
//
//        ArrayList<Carro> carros = new ArrayList<>();
//        carros.add(carro);
//        carros.add(carro2);
//        carros.add(carro3);
//
//        for (Carro car : carros){
//            if (car.cor == "Vermelho"){
//                System.out.println(car);
//            }
//        }

//        EXERCICIO 5 LISTA DE ANIMAIS

//        Animal animal1 = new Animal("Kira", "Cão");
//        Animal animal2 = new Animal("Nina", "Cão");
//        Animal animal3 = new Animal("Ayla", "Gato");
//
//        ArrayList<Animal> animais = new ArrayList<>();
//        animais.add(animal1);
//        animais.add(animal2);
//        animais.add(animal3);
//
//       for (Animal animal : animais){
//           if (animal.especie == "Gato"){
//               System.out.println(animal);
//           }
//       }


//        EXERCICIO 6 LISTA DE VIAGENS
//        Viagem viagem = new Viagem("Portugal", 5);
//        Viagem viagem2 = new Viagem("Rio de Janeiro", 10);
//        Viagem viagem3 = new Viagem("Santa Catarina", 2);
//
//        ArrayList<Viagem> viagens = new ArrayList<>();
//        viagens.add(viagem);
//        viagens.add(viagem2);
//        viagens.add(viagem3);
//
//        for (Viagem v : viagens){
//            if (v.duracaoDias > 7){
//                System.out.println(v);
//            }
//        }

//        EXERCICIO - Lista de receitas
//        Receita receita1 = new Receita("Torta de bolacha", 30);
//        Receita receita2 = new Receita("Fricasse", 60);
//        Receita receita3 = new Receita("Strogonofu", 20);
//
//        ArrayList<Receita> receitas = new ArrayList<>();
//        receitas.add(receita1);
//        receitas.add(receita2);
//        receitas.add(receita3);
//
//        System.out.println("=================");
//        System.out.println("Receitas que levam menos de 30 minutos para fazer");
//        for (Receita receita : receitas){
//            if (receita.tempoPreparo < 30){
//                System.out.println(receita);
//            }
//        }

//        EXERCICIO 9 LISTA DE FILMES
//        Filme filme1 = new Filme("Avatar", "Ficção cientifica", 10);
//        Filme filme2 = new Filme("Guerreiras do K-pop", "Animação", 8);
//        Filme filme3 = new Filme("Crepusculo", "Ficção", 3);
//
//        ArrayList<Filme> filmes = new ArrayList<>();
//        filmes.add(filme1);
//        filmes.add(filme2);
//        filmes.add(filme3);
//
//        System.out.println("=================");
//        System.out.println("Filmes melhores avaliados");
//        System.out.println("=================");
//        for (Filme f : filmes){
//            if (f.avaliacao >= 8){
//                System.out.println(f);
//                System.out.println("---");
//            }
//        }

//        EXERCICIO 9 - LISTA DE ATLETAS
        Atleta atleta1 = new Atleta("Simone Biles", "Ginastica", 8);
        Atleta atleta2 = new Atleta("Rebeca Andrade", "Ginastica", 10);
        Atleta atleta3 = new Atleta("Neymar", "futebol", 0);

        ArrayList<Atleta> atletas = new ArrayList<>();
        atletas.add(atleta1);
        atletas.add(atleta2);
        atletas.add(atleta3);

        Atleta maiorPontuacao = atletas.get(0);
        for (Atleta atleta : atletas){
            if (atleta.pontuacao > maiorPontuacao.pontuacao){
                System.out.println(atleta);
            }
        }


    }
}