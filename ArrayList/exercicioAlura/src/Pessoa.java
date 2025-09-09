public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Sobreescreve o ToString. no terminal aparece da forma que foi reescrita
    @Override
    public String toString() {
        return "Nome: " + nome + " Idade " + idade;
    }
}
