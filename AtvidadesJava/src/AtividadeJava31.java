import java.util.Scanner;
public class AtividadeJava31 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
                do {
                    System.out.println("digite um numero 0 para vazar ");
                    numero = leia.nextInt();
                    System.out.println("Voce digitou um numero " + numero);
                } while (numero != 0);
        System.out.println("Encerrado!");
        leia.close();

                }




    }




