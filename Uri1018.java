import java.util.Scanner;

public class Uri1018 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();

        if (a > 0 && a < 1000000)  {
            System.out.println(a);
            System.out.printf("%d nota(s) de R$ 100,00\n", a / 100);
            a = a % 100;
            System.out.printf("%d nota(s) de R$ 50,00\n", a / 50);
            a = a % 50;
            System.out.printf("%d nota(s) de R$ 20,00\n", a / 20);
            a = a % 20;
            System.out.printf("%d nota(s) de R$ 10,00\n", a / 10);
            a = a % 10;
            System.out.printf("%d nota(s) de R$ 5,00\n", a / 5);
            a = a % 5;
            System.out.printf("%d nota(s) de R$ 2,00\n", a / 2);
            a = a % 2;
            System.out.printf("%d nota(s) de R$ 1,00\n", a);
        }




    }


    
}
