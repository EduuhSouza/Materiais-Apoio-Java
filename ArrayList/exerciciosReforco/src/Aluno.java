public class Aluno {
    public String nome;
    public double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " -  Nota: " + nota;
    }
}
