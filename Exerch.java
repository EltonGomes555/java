import java.util.Scanner;

public class Exerch {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double vl, ra, al, pi;

        System.out.println("Digite o valor do Raio A do Cilindro");
        ra = teclado.nextDouble();

        System.out.println("Digite o valor da Altura do Cilindro");
        al = teclado.nextDouble();

        pi = 3.14;

        vl = pi * ra * ra * al;
        System.out.println("Volume Total do Cubo = " + vl);

    }
 
    
}
