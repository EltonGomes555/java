import java.util.Scanner;

public class Exerce {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float baseM, basem, altura, area;

        System.out.print("Digite o valor da base Maior:");
        baseM = teclado.nextFloat();
        System.out.print("Digite o valor da base menor:");
        basem = teclado.nextFloat();
        System.out.print("Digite o valor da altura:");
        altura = teclado.nextFloat();

        area =(baseM + basem) * altura / 2;
        System.out.printf("A area do trapezio de bases %.2f e %.2f e a altura %.2f vale %.2f\n", baseM, basem, altura, area);
    }

    
}
