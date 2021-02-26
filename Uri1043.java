import java.util.Scanner;

public class Uri1043 {
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);

        float A, B, C, areaTraphisium, perimeterTriangle ;
		
		A = teclado.nextFloat();
		B = teclado.nextFloat();
		C = teclado.nextFloat();
		
		if ((A < (float)(B+C)) && (B < (float)(A+C)) && (C < (float)(B+A))) {

			//perimetro do triãngulo = a + b + c;
			//area de transição = (a + b)*h/2;

			perimeterTriangle = A + B + C;
			System.out.printf("Perimetro = %.1f\n",perimeterTriangle);
		
			
		}
        else {
			areaTraphisium = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f\n",areaTraphisium);
			}



    }



}