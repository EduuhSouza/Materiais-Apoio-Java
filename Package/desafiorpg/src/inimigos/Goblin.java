package inimigos;

public class Goblin {
    private String nomeGoblin;
    private String armaGoblin;

    public void setNomeGoblin(String nomeGoblin){
        this.nomeGoblin = nomeGoblin;
    }

    public void setArmaGoblin(String armaGoblin){
        this.armaGoblin = armaGoblin;
    }

    public void exibaFichaGoblin(){
        System.out.println("----------------------------");
        System.out.printf("Nome do Inimigo: %s\n", nomeGoblin);
        System.out.println("Classe/raça: Goblin");
        System.out.printf("\nArma do Inimigo: %s\n", armaGoblin);
        System.out.println("----------------------------");
    }
}
