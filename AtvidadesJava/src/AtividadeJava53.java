import java.util.Scanner;

public class AtividadeJava53 {

    public static boolean ehPrimo(int numero){
        if(numero % 2 == 0)
            return true;
        else
            return false;


    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número inteiro e descubra se ele é primo");
        int numero = leia.nextInt();
        String resultado = ehPrimo(numero)?"é primo":"não e primo";
        System.out.println("O número digitado " + resultado);
    }

}
