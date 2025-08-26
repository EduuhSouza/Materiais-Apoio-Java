public class SalaFundadores extends Sala{
    // Construtor já define nome, descrição e ano
    public SalaFundadores() {
        super("Sala dos Fundadores", "História dos criadores do Java", 2025);
    }

//Sobrescrevendo o método abstrato -> polimorfismo
    @Override
    public void exibirConteudo() {
        System.out.println("Bem-vindo à " + getNome());
        System.out.println("Ano de criação: " + getAnoCriacao());
        System.out.println("Aqui você descobre que o Java foi criado por James Gosling e sua equipe na Sun Microsystems.");
        System.out.println("Inicialmente, o projeto se chamava *Oak* antes de virar Java.");
    }
}
