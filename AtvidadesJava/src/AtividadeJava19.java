import java.util.Scanner;
public class AtividadeJava19 {
    public static void main(String[] args) {

        Scanner entrada = new

                Scanner(System.in);
        System.out.print("Digite um valor para sua idade: ");
        int idade = entrada.nextInt();

        if (idade >= 18){
            System.out.println(idade + " é maior de idade " + 18);
    }else if (idade <= 18){
          System.out.println(idade + " é menor de idade" + 18);}


    }
}
