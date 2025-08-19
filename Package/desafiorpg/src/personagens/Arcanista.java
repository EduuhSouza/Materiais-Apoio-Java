package personagens;

public class Arcanista {
    public String arcanista;
    public int idadeArcanista;

    public void exibirFichaArcanista(){
        System.out.println("__________________________");
        System.out.printf("\nNome: %s", arcanista);
        System.out.println("\nClasse: Arcanista");
        System.out.printf("Idade: %s\n", idadeArcanista);
        System.out.println("__________________________");
    }
}
