import java.util.Scanner;

  public class AtividadeJava08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double n1= 0,n2= 0,n3= 0,media= 0;
        System.out.println("Digita a nota 1");
        n1 = leia.nextDouble();
        System.out.println("Digita a nota 2");
        n2 = leia.nextDouble();
        System.out.println("Digita a nota 3");
        n3 = leia.nextDouble();
        media = (n1 + n2 + n3)/3;
        System.out.println("As medias das notas é:" + media);
    }
}
