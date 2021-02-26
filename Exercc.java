import java.util.Scanner;

public class Exercc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        System.out.print("Digite o valor da base:");
        base = teclado.nextDouble();
        System.out.print("Digite o valor da altura:"); 
        altura = teclado.nextDouble();

        area = base * altura / 2;

        System.out.print("O valor da area do triângulo vale:%f" + area); 
        
    }
    
}
