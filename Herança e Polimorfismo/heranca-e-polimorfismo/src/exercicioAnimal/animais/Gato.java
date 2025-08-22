package exercicioAnimal.animais;

public class Gato extends Animal{

    //    CONSTRUTOR
    public Gato(String nome) {
        super(nome);
    }

//    METODO
    public void miar(){
        System.out.printf("\n%s miou", getNome());
    }
}
