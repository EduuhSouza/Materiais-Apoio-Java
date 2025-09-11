public class Animal {
    public String especie;
    public String nome;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Nome do animal: " + nome + " - Especie: " + especie;
    }
}
