public class Livro {
    public String titulo;
    public String autor;
    public static int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Titulo do livro: " + titulo + "\nAutor: " + autor + "\nAno de lançamento: " + anoPublicacao;
    }
}
