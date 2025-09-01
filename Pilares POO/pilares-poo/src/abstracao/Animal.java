package abstracao;

public abstract class Animal {
    private String nome;
    private String animal;
    private String raca;
    private String cor;
    private String som;

    public Animal(String nome, String animal, String raca, String cor, String som) {
        this.nome = nome;
        this.animal = animal;
        this.raca = raca;
        this.cor = cor;
        this.som = som;
    }

    public Animal(String nome, String animal, String raca, String cor) {
    }

    //    GETTER E SETTER PARA O OBJETO PRIVATE
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    //    METODO ABSTRATO QUE DEVE SER IMPLEMENTADO PELAS SUBCLASSES
    public abstract void exibirAnimal();


}
