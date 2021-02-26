public class Continhas{
    public static void main(String args []) {
        int a,b,c;

        a= 10;
        b= 7;

        c = a + b;
        System.out.println("Valor da soma =" + c);

        c = a - b;
        System.out.println("Valor da subt = " + c );

        c = a * b;
        System.out.println("Valor da mult = " + c );

        c = a / b;
        System.out.println("Valor da div = " + c );

        c = a % b; //Aqui pego o resto da divisão de 10 por 7
        System.out.println("Valor do resto = " + c );

        float d;
        d = a / b;

        System.out.println("Valor da divisão real = " + d );
        
        d=10.0f/3;
        System.out.println("Valor da divisão = " + d );
        
    }
    
}
