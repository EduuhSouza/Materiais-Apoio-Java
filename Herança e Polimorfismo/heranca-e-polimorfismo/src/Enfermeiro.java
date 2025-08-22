public class Enfermeiro extends Pessoa{
    int horaTrabalho;
    String setor;
    String numeroCadastro;

    public Enfermeiro(int horaTrabalho, String setor, String numeroCadastro, String nome, int idade, String documento) {
        super(nome, idade, documento);
        this.horaTrabalho = horaTrabalho;
        this.numeroCadastro = numeroCadastro;
        this.setor = setor;
    }

    public void exibirInformacoes(){
        super.exibirInformacoes(); // PUXA AS INFORMÇÕES DO METODO DA CLASSE PAI (PESSOA)
        System.out.println("Hora de Trabalho: " + this.horaTrabalho);
        System.out.println("Setor: " + this.setor);
        System.out.println("Número de Cadastro: " + this.numeroCadastro);
        System.out.println("____________________________");

    }
}
