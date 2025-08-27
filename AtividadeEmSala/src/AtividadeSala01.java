import java.util.Scanner; //Biblioteca para processar a entrada de dados
public class AtividadeSala01 {

    public static void main(String[] args) {

        //Criar e instanciar o objeto Scanner
        Scanner leia = new Scanner(System.in);
        String texto = "";

        String nome = "";
        int idade = 0;

        System.out.println("Nome: " + nome);
        nome = leia.nextLine();
        System.out.println("Idade: " + idade);
        idade = leia.nextInt();
        //SAIDA DE DADOS
        System.out.println("String == Texto \n Digite um texto qualquer abaixo:");
        //ENTRADA DE DADOS
        texto = leia.nextLine();
        //Mostrar dados digitado pelo usuário
        System.out.println("O usário disse: " + texto);



    }

}
