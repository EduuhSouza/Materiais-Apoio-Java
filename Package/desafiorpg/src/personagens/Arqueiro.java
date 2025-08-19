package personagens;

public class Arqueiro {
    public String arqueiro;
    public int idadeArqueiro;

    public void exibirFichaArqueiro(){
        System.out.println("__________________________");
        System.out.printf("\nNome: %s", arqueiro);
        System.out.println("\nClasse: Ladino");
        System.out.printf("Idade: %s\n", idadeArqueiro);
        System.out.println("__________________________");
    }
}
