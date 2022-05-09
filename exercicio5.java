import java.util.Scanner;

public class exercicio5{
 
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
 
        System.out.println("Valor do dólar: ");
        float nuDolar = entrada.nextFloat();
 
        System.out.println("Valor em reais: ");
        float nuReal = entrada.nextFloat();
 
        float transforma = nuReal/nuDolar;
        System.out.println("O valor é: "  + transforma);
 
        entrada.close();
 
 
    }
}
