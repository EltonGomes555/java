import java.util.Scanner;

public class Uri1050 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a[] = {61, 71, 11, 21, 32, 19, 27, 31};
        String b[] = {"Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas", "Vitoria", "Belo Horizonte"};
        int c = teclado.nextInt();
        int j = 0, i;
        for (i = 0; i < 8; i++) {
            if (c == a[i]) {
                System.out.println(b[i]);
            } else {
                j++;
            }
        }
        if (i == j) {
            System.out.printf("DDD nao cadastrado\n");
        }

    }
    
}
