package exercicioAnimal.animais;

public class Cachorro extends Animal{
//    CONSTRUTOR
    public Cachorro(String nome) {
        super(nome);
    }

//    METODO
    public void latir(){
        System.out.printf("%s latiu", getNome());
    }

    public void lamber(){
        System.out.printf("%s lambeu", getNome());
    }



}
