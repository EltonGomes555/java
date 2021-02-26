import java.util.Scanner;

public class Uri1014 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int km;
        double consumo, kml;

        //entrada
        km       = teclado.nextInt();
        consumo  = teclado.nextDouble();
        
        //processamento
        kml = km / consumo;

        //saida
        System.out.printf("%.3f km/l\n", kml);


    }
    
}
