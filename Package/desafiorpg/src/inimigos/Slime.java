package inimigos;

public class Slime {
    private String nomeSlime;
    private String armaSlime;

    public void setArmaSlime(String armaSlime) {
        this.armaSlime = armaSlime;
    }

    public void setNomeSlime(String nomeSlime) {
        this.nomeSlime = nomeSlime;
    }

    public void exibaFichaSlime(){
        System.out.println("----------------------------");
        System.out.printf("Nome do Inimigo: %s\n", nomeSlime);
        System.out.println("Classe/raça: Lobo");
        System.out.printf("\nArma do Inimigo: %s\n", nomeSlime);
        System.out.println("----------------------------");
    }
}
