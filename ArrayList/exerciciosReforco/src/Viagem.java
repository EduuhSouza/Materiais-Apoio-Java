public class Viagem {
    public String destino;
    public int duracaoDias;

    public Viagem(String destino, int duracaoDias) {
        this.destino = destino;
        this.duracaoDias = duracaoDias;
    }

    @Override
    public String toString() {
        return "Destino: " + destino +
                " - duracao em Dias: " + duracaoDias;
    }
}
