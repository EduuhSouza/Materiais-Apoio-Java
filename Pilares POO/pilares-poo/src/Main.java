import abstracao.Animal;
import abstracao.Cachorro;
import abstracao.Gato;
import encapsulamento.ExemplosEncapsulamento;
import heranca.Funcionario;
import polimorfismo.Filme;
import polimorfismo.Video;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        ENCAPSULAMENTO
        ExemplosEncapsulamento encapsulamento = new ExemplosEncapsulamento("Eduarda", 20);
        encapsulamento.exibir();


//        HERANÇA
        Funcionario funcuinario = new Funcionario("Eduarda", 1234, 800.44);
        funcuinario.exibirFicha();

//        ABSTRAÇÃO

//        CLASSE CACHORRO
        Cachorro dog = new Cachorro("Kira", "Canino", "Caozin caramelo", "Caramelo", "AUAU");
        dog.exibirAnimal();

//          CLASSE GATO
        Gato gato = new Gato("Mingau","Felino", "Gatin", "branco", "Miau");
        gato.exibirAnimal();

//      POLIMORFISMO
//        Video video = new Video();
//        video.play();

//        METODO SOBREESCREVER, um unico metodo com comportamentos diferentes
        Filme filme = new Filme("Avatar");
        filme.play();

//        METODO SOBRECARREGADO
        filme.play("Portugues");

    }
}