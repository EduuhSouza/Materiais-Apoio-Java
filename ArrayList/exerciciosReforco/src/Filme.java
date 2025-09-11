public class Filme {
    public String titulo;
    public String genero;
    public double avaliacao;

    public Filme(String titulo, String genero, double avaliacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Titulo do Filme" + titulo +
                "\nGenero: " + genero +
                "\nAvaliação: " + avaliacao;
    }
}
