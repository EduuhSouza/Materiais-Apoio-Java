package polimorfismo;

// EXISTEM 2 TIPOS DE POLIMORFISMO A SOBREESCRITA E A SOBRECARGA

//A sobrecarga vem acompanhado  da anotação @Override

//Poli - muitas
// morfo - múltiplas formas

//Permite que o mesmo nome, represente vários comportamentos diferentes

public class Video {
    private String nome;

    public void play(){
        System.out.println("Play: video");
    }

    public Video(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
