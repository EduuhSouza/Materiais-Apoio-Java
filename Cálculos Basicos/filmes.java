public class filmes {
    public static void main(String[] args) {
        System.out.println("Filme: A Mulher Rei");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaFilme = 6.9;

        // Calcular a media dos 3 valores
        double media =  (6.9 + 10 + 10) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Em 1800, o general Nanisca treina um grupo de mulheres guerreiras para proteger 
                o reino africano de Dahomey de um inimigo estrangeiro.
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao  = (int) (media / 2);
        System.out.println("Classificação: " + classificacao + " Estrelas");
    }
}
