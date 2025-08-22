package exercicioAnimal;

import exercicioAnimal.animais.Cachorro;
import exercicioAnimal.animais.Dragao;
import exercicioAnimal.animais.Gato;
import exercicioAnimal.animais.Pombo;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Kira");
//        cachorro.setNome("Kira");

        cachorro.comer();
        cachorro.latir();

        Gato gato = new Gato("Mingau");
        gato.miar();

        Dragao dragao = new Dragao("Banguela");
        dragao.soltarFogo();
        dragao.voar();

        Pombo pombo = new Pombo("Sedex");
        pombo.enviarCarta();
        pombo.fazerPru();
        pombo.voar();
    }
}
