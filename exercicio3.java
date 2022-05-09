import java.util.Scanner;

public class exercicio3{
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        System.out.println("Informe sua idade: ");
        int idad = entrada.nextInt();
 
        System.out.println("Informe o ano atual: ");
        int anoAtual = entrada.nextInt();
 
        int somadAno = anoAtual - idad;
        System.out.println("Sua idade é: " + somadAno);
 
        entrada.close();
    }
}
