public class Paciente extends Pessoa{
    String matricula;
    String planoDeSaude;

//    CONSTRUTOR
    public Paciente(String matricula, String planoDeSaude, String nome, int idade, String documento) {
        super(nome, idade, documento);
        this.matricula = matricula;
        this.planoDeSaude = planoDeSaude;
    }

    public void exibirInformacoes(){
        super.exibirInformacoes(); // PUXA AS INFORMÇÕES DO METODO DA CLASSE PAI (PESSOA)
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Plano de Saúde: " + this.planoDeSaude);
        System.out.println("____________________________");
    }

}
