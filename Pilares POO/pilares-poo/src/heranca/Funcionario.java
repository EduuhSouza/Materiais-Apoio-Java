package heranca;

//EXTENDS: extender de outra classe
// A CLASSE FUNCIONARIO ESTA HERDANDO DA CLASSE PESSOA OS OBJETOS NOME E DOCUMENTO
//O SUPER SERVE PARA PUXAR DA CLASSE MÃE OS ELEMENTOS QUE QUEREMOS USAR NESTA CLASSE


public class Funcionario extends Pessoa{
    private double salario;

//    CONSTRUTOR
    public Funcionario(String nome, int documento, double salario) {
        super(nome, documento);
        this.salario = salario;
    }

    //    GETTER E SETTER PARA O OBJETO PRIVATE
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirFicha(){
        System.out.println("___________");
        System.out.println("Nome: " + nome);
        System.out.println("Documento: " + documento);
        System.out.println("Sálario: " + salario);
    }
}
