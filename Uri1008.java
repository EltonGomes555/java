import java.util.Scanner;

public class Uri1008 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int num, qtdHoras;
        float valorHora, salario;

        //entrada
        num       = teclado.nextInt();
        qtdHoras  = teclado.nextInt();
        valorHora = teclado.nextFloat();

        //processamento
        salario   = qtdHoras * valorHora;

        //saida
        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f\n",salario);



    }

    
}
