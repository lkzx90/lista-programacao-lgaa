import java.util.Scanner;
public class AtividadeJava22 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número: ");
            double z = scanner.nextDouble();

            if (z > 0) {
                System.out.println("O número é positivo.");
            } else if (z < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é zero.");
            }

            scanner.close();


        }
    }
