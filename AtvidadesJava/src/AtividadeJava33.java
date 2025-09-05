import java.util.Scanner;
public class AtividadeJava33 {
        public static void main(String[] args) {

            Scanner leia = new Scanner(System.in);
            int idades = 0, totalDeItens = 0;
            double media = 0, soma= 0;

            do {
                System.out.println("digite um valor negativo para vazar ");
                idades = leia.nextInt();
                soma+= idades; //soma = soma + idades;
                totalDeItens++; //totalDeItens = totalDeItens + 1;
                System.out.println("Voce digitou um numero " + idades);
            } while (idades >= 0 );
            System.out.println("Acesso Permitido!");
            leia.close();
            media = soma/totalDeItens;
            System.out.println("O resultado é "+media);
        }
}
