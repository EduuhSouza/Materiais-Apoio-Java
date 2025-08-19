package inimigos;

public class Humano {
    private String nomeHumano;
    private String armaHumano;

    public void setNomeHumano(String nomeHumano) {
        this.nomeHumano = nomeHumano;
    }

    public void setArmaHumano(String armaHumano){
        this.armaHumano = armaHumano;
    }

    public void exibaFichaHumano(){
        System.out.println("----------------------------");
        System.out.printf("Nome do Inimigo: %s\n", nomeHumano);
        System.out.println("Classe/raça: Humano");
        System.out.printf("\nArma do Inimigo: %s\n", armaHumano);
        System.out.println("----------------------------");
    }
}
