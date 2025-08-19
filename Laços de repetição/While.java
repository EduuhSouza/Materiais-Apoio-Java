import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var nome = "";

        //1 FORMA DE FAZER O WHILE
//        while (!nome.equals("sair")){
//            System.out.println("Digite um nome");
//            nome = scanner.next();
//            System.out.println(nome);
//        }

        //2 FORMA DE FAZER O WHILE
//        while (true){
//            System.out.println("Digite um nome");
//            nome = scanner.next();
//            System.out.println(nome);
//
//            if (nome.equalsIgnoreCase("sair")) break;
//        }

        //3 FORMA DE FAZER O WHILE/DO WHILE
        do{
            System.out.println("Digite um nome");
            nome = scanner.next();
            System.out.println(nome);

        } while (!nome.equalsIgnoreCase("sair"));
    }
}
