import java.util.Scanner;

public class Uri1017 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempo = teclado.nextInt();
        int velmedia = teclado.nextInt();

        float auxil = tempo * velmedia;

        System.out.printf("%.3f\n", auxil / 12);



    }
    
}
