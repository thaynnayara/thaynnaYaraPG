import java.util.Scanner;

public class exercicio6{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Coloque a temperatura em Celsius: ");
        int celsius = entrada.nextInt();

        int conversao = (celsius * 9/5 + 32);
        //se fosse para usar 9.0 e 5.0 tinha que usar float
        System.out.println("A temperatura em Fahrenheit é: " + conversao);

        entrada.close();


    }
}