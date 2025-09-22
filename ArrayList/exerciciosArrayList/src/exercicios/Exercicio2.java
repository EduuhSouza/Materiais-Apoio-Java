package exercicios;

public class Exercicio2 implements Comparable<Exercicio2>{
    public String arma;

    public Exercicio2(String arma) {
        this.arma = arma;
    }

    @Override
    public int compareTo(Exercicio2 armas) {
        return arma.compareTo(armas.arma);
    }
}
