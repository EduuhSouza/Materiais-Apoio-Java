package polimorfismo;

public class Filme extends Video{

    private String audio;
    private String legenda;

//    CONSTRUTOR
    public Filme(String nome) {
        super(nome);
        this.audio = "Português";
        this.audio = "nenhuma";
    }

    @Override
    public void play() {
        System.out.println("Play no filme " + getNome());
        super.play();
    }

//    SOBRECARREGAR O METODO
    public void play(String audio){
        System.out.println("Play no filme " + getNome() + " no idioma " + audio);
        this.audio = audio;
    }


}
