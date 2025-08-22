package exercicioAnimal.animais;

public class Animal {
    private String nome;

//    CONSTRUTOR
    public Animal(String nome) {
        this.nome = nome;
    }

//    METODO
    public void comer(){
        System.out.printf("%s comeu\n", nome);
    }

    public void beber(){
        System.out.printf("%s comeu\n", nome);
    }

    //    SETTER E GETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
