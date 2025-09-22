package exercicios;

public class Exercicio1 implements Comparable<Exercicio1>{
    public String nome;
    public int nivelHabilidade;

    public Exercicio1(String nome, int nivelHabilidade) {
        this.nome = nome;
        this.nivelHabilidade = nivelHabilidade;
    }

    // SOBREESCREVER O compareTo para comparar
    // Exercicio1 - classe
    // jogadores - lista
    // jogadores.nome - compara os nomes da lista para organizar

    @Override
    public int compareTo(Exercicio1 jogadores) {
        return nome.compareTo(jogadores.nome);
    }
}
