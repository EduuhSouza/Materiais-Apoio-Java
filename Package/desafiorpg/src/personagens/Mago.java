package personagens;

public class Mago {
    public String mago;
    public int idadeMago;

    public void exibirFichaMago(){
        System.out.println("__________________________");
        System.out.printf("\nNome: %s", mago);
        System.out.println("\nClasse: Mago");
        System.out.printf("Idade: %s\n", idadeMago);
        System.out.println("__________________________");
    }
}
