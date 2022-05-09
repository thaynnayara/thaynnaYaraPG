import java.util.Scanner;

public class exercicio1{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        System.out.println("Informe um número: ");
        int num1 = entrada.nextInt();
 
 
        int sucessor = num1 + 1;
        int antecessor = num1 - 1;
 
        System.out.println("Sucessor: " + sucessor);
        System.out.println("Antessor: " + antecessor);
 
        entrada.close();
 
    }
}
