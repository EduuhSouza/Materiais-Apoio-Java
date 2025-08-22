package exercicioPessoa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informações do Paciente");

        Pessoa paciente = new Paciente("1234", "Prime", "Eduuh", 20, "123456");
        paciente.exibirInformacoes();

        System.out.println("Informações do Enfermeiro");

        Pessoa enfermeiro = new Enfermeiro(12, "UTI", "123", "Julia", 20, "1234");
        enfermeiro.exibirInformacoes();
    }
}