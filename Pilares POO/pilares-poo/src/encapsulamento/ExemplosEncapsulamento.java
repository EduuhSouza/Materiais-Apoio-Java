package encapsulamento;

public class ExemplosEncapsulamento {
    private String nome;
    private int idade;

    public ExemplosEncapsulamento(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

//    METODOS GETTER E SETTER PARA ENCAPSULAMENTO

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibir(){
        System.out.println("Meu nome é " + nome);
        System.out.println("Tenho " + idade + " anos");
    }
}
