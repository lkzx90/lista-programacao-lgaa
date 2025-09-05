import java.util.Scanner;
public class AtividadeJava30 {
    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);
        String opcao = "" ;
        System.out.println("Escolhha uma das opções abaixo:");
        System.out.println("" +
                "Opção: A \n" +
                "Opção: B \n" +
                "Opção: C \n" +
                "Opção: D \n");
                opcao = leia.next();
        switch (opcao){
            case "A":
                System.out.println("A FOI ESCOLHIDO");
                break;
            case "B":
                System.out.println("B FOI ESCOLHIDO");
                break;
            case "C":
                System.out.println("C FOI ESCOLHIDO");
                break;
            case "D":
                System.out.println("D FOI ESCOLHIDO");
              break;
            default:
                System.out.println("Invalido sua resposta!");
                break;


        }
    }}

