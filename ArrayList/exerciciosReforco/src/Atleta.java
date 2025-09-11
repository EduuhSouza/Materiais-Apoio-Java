public class Atleta {
    public String nome;
    public String modalidade;
    public double pontuacao;

    public Atleta(String nome, String modalidade, double pontuacao) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return "Atleta Nome: " + nome +
                "\nModalidade: " + modalidade +
                "\nPontuacao: " + pontuacao;
    }
}
