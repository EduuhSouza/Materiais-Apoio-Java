package abstracao;

public class Gato extends Animal{

    public Gato(String mingau, String nome, String animal, String raca, String cor) {
        super(nome, animal, raca, cor);
    }

    //    OVERRIDE É USADO PARA SUBSCREVER O METODO PARA OUTRAS CLASSES
    @Override
    public void exibirAnimal() {
        System.out.println("_________________");
        System.out.println("Nome do Animal: " + getNome());
        System.out.println("Animal: " + getAnimal());
        System.out.println("Raça: " + getRaca());
        System.out.println("Cor: " + getCor());
        System.out.println("");
    }
}
