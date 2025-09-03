import java.util.Scanner;
public class AtividadeJava18 {
    public static void main(String[] args) {
        Scanner entrada = new
                Scanner(System.in);
        System.out.print("Digite um valor para 'q' e digite um valor para 'p'.");
        int q = entrada.nextInt();
        int p = entrada.nextInt();


        if (p > q) {
            System.out.println(p + " é maior que " + q);
        }else if  (p < q) {
            System.out.println(p + " é menor que " + q);
        } else {
            System.out.println(p + " é igual que " + q);
        }


    }
}
