import java.util.Scanner;

public class exercicio4{
 
    public static void main(String[] args) {
   
        Scanner entrada = new Scanner(System.in);
 
        System.out.println("Velocidade em km/h: ");
        int velocikm = entrada.nextInt();
       
        int conversao = (velocikm/36);
        System.out.println("Conversão para m/s: " + conversao);
 
        entrada.close();
 
 
    }
}
