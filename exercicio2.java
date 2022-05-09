import java.util.Scanner;

public class exercicio2{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
 
        System.out.println("Informe um número: ");
        int num1 = entrada.nextInt();
 
        System.out.println("Informe outro número: ");
        int num2 = entrada.nextInt();
 
        System.out.println("Informe mais um número: ");
        int num3 = entrada.nextInt();
 
        int resultado = num1 + num2 + num3;
        System.out.println("resultado: " + resultado);
       
        entrada.close();
       
    }
 
}
