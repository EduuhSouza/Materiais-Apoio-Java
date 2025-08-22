package exercicioAnimal.animais;

public class Dragao extends Ave{
//   SEMPRE CHAMAR O CONSTRUTOR PARA CHAMAR A CLASSE SUPER (CLASSE MAE/PAI)
    public Dragao(String nome) {
        super(nome);
    }

    public void soltarFogo(){
        System.out.printf("\n%s soltou fogo\n", getNome());
    }

}
