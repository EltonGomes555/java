import java.util.Scanner;

public class Uri1019 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int vi = teclado.nextInt();
        System.out.printf("%d:%d:%d\n", vi / 3600, (vi % 3600) / 60, ((vi % 3600) % 60));





    }

    
}
