import personagens.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Helou e World!");

        Arcanista personagemArcanista = new Arcanista();
        Arqueiro personagemArqueiro = new Arqueiro();
        Guerreiro personagemGuerreiro = new Guerreiro();
        Ladino personagemLadino = new Ladino();
        Mago personagemMago = new Mago();



        personagemArqueiro.arqueiro = "Flint Fish";
        personagemGuerreiro.guerreiro = "Bartolomeu Bart";
        personagemArcanista.arcanista = "Aiylin Nymerion";
        personagemLadino.ladino = "Astra deLyn";
        personagemMago.mago = "Freya Greenmo";

        personagemArqueiro.idadeArqueiro = 20;
        personagemGuerreiro.idadeGuerreiro = 50;
        personagemArcanista.idadeArcanista = 130;
        personagemLadino.idadeLadino = 70;
        personagemMago.idadeMago = 100;

        personagemArqueiro.exibirFichaArqueiro();
        personagemGuerreiro.exibirFichaGuerreiro();
        personagemArcanista.exibirFichaArcanista();
        personagemLadino.exibirFichaLadino();
        personagemMago.exibirFichaMago();
    }
}