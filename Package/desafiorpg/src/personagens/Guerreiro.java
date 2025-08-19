package personagens;

public class Guerreiro {
    public String guerreiro;
    public int idadeGuerreiro;

    public void exibirFichaGuerreiro(){
        System.out.println("__________________________");
        System.out.printf("\nNome: %s", guerreiro);
        System.out.println("\nClasse: Guerreiro");
        System.out.printf("Idade: %s\n", idadeGuerreiro);
        System.out.println("__________________________");
    }
}
