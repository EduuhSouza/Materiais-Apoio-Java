package inimigos;

public class Orc {
    private String nomeOrc;
    private String armaOrc;

    public void setNomeOrc(String nomeOrc){
        this.nomeOrc = nomeOrc;
    }

    public void setArmaOrc(String armaOrc) {
        this.armaOrc = armaOrc;
    }

    public void exibaFichaOrc(){
        System.out.println("----------------------------");
        System.out.printf("Nome do Inimigo: %s\n", nomeOrc);
        System.out.println("Classe/raça: Lobo");
        System.out.printf("\nArma do Inimigo: %s\n", armaOrc);
        System.out.println("----------------------------");
    }
}
