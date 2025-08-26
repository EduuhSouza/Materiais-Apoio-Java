public class SalaCuriosidades extends Sala{
    // Construtor já define nome, descrição e ano
    public SalaCuriosidades() {
        super("Sala das Curiosidades", "Curiosidades sobre o Java", 2025);
    }

//    Sobrescrevendo o método abstrato / polimorfismo
    @Override
    public void exibirConteudo() {
        System.out.println("🤔 " + getNome());
        System.out.println("Ano de criação: " + getAnoCriacao());
        System.out.println("Curiosidades:");
        System.out.println("- O nome 'Java' veio do café da ilha de Java, que os criadores bebiam muito.");
        System.out.println("- O mascote do Java é o 'Duke'.");
        System.out.println("- A filosofia do Java sempre foi 'Write Once, Run Anywhere'.");
    }

}
