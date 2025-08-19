package inimigos;

public class Lobo {
    private String nomeLobo;
    private String armaLobo;

    public void setNomeLobo(String nomeLobo){
        this.nomeLobo = nomeLobo;
    }

    public void setArmaLobo(String armaLobo){
        this.armaLobo = armaLobo;
    }

    public void exibaFichaLobo(){
        System.out.println("----------------------------");
        System.out.printf("Nome do Inimigo: %s\n", nomeLobo);
        System.out.println("Classe/raça: Lobo");
        System.out.printf("\nArma do Inimigo: %s\n", armaLobo);
        System.out.println("----------------------------");
    }
}
