public class SalaVersoes extends Sala{
    // Construtor já define nome, descrição e ano
    public SalaVersoes(){
        super("Sala das versões", "Evolução das versões do Java ao longo do tempo", 2025);
    }

//    Sobrescrevendo o método abstrato -> polimorfismo
    @Override
    public void exibirConteudo() {
        System.out.println("Bem-vindo á " + getNome());
        System.out.println("Ano de criação: " + getAnoCriacao());
        System.out.println("Versões marcantes:");
        System.out.println("- Java 1.0 (1996): Primeira versão pública.");
        System.out.println("- Java 5 (2004): Introdução de Generics, Enum e Anotações.");
        System.out.println("- Java 8 (2014): Streams e Lambdas revolucionaram a linguagem.");
        System.out.println("- Java 17 (2021): Versão LTS estável e moderna.");
    }
}
