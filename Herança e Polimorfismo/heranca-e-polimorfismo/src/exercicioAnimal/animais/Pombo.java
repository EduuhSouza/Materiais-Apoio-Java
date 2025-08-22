package exercicioAnimal.animais;

public class Pombo extends Ave{

    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
        cartasEnviadas = 2;
    }

    public void fazerPru(){
        System.out.printf("%s fez pruuuuuuuuuuuuuhhh\n", getNome());

    }

    public void enviarCarta(){
        System.out.printf("\n%s envou a carta\n", getNome());
        this.cartasEnviadas++;
    }

//    GETTER
    public int getCartasEnviadas() {
        return cartasEnviadas;
    }
}
