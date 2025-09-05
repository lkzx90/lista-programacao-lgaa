import java.util.Scanner;
public class AtividadeJava32 {
    public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    int numero;
                do {
        System.out.println("digite um numero 1234 para vazar ");
        numero = leia.nextInt();
        System.out.println("Voce digitou um numero " + numero);
    } while (numero != 1234);
        System.out.println("Acesso Permitido!");
        leia.close();

}

}