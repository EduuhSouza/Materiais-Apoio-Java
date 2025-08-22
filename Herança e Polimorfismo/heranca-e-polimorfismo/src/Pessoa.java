public class Pessoa {
    String nome;
    int idade;
    String documento;

    //CONSTRUTOR
    public Pessoa(String nome, int idade, String documento) {
        this.nome = nome;
        this.documento = documento;
        this.idade = idade;
    }

    //METODO
    void exibirInformacoes(){
        System.out.println("____________________________");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Documento: " + this.documento);
    }
}
