import java.util.Scanner;

public class Exerca {
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        double lado, area;

        //entrada
        System.out.println("Digite o valor do lado do quadrado");
        lado = teclado.nextDouble();

        //processamento

        area = lado * lado;

        //saida
        System.out.println("O valor da area do quadrado é " +area);
        

    
    }

    
}
