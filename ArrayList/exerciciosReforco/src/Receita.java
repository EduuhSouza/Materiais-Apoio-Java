public class Receita {
    public String nome;
    public int tempoPreparo;

    public Receita(String nome, int tempoPreparo) {
        this.nome = nome;
        this.tempoPreparo = tempoPreparo;
    }

    @Override
    public String toString() {
        return "Nome da receita:" + nome +
                " = Tempo de Preparo: " + tempoPreparo;
    }
}
