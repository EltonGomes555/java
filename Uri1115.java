import java.util.Scanner;

public class Uri1115 {

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int X = teclado.nextInt();
		int Y = teclado.nextInt();

		while (X != 0 && Y != 0) {
			if (X == 0 || Y == 0) break;
			else if (Y > 0 && X > 0) System.out.println("primeiro");
			else if (Y > 0 && X < 0) System.out.println("segundo");
			else if (Y < 0 && X < 0) System.out.println("terceiro");
			else if (Y < 0 && X > 0) System.out.println("quarto");
			X = teclado.nextInt();
			Y = teclado.nextInt();
		}
        



    }
    
}
