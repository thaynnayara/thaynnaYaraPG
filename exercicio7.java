/*A importância de R$ 780.000,00 será dividida entre três ganhadores de um concurso, sendo que:
a. O primeiro ganhador receberá 46% do total; valor: 358800
b. O segundo receberá 32% do total; valor: 249600
c. O terceiro receberá o restante. valor: 109200
	Calcule e imprima a quantia recebida por cada um dos ganhadores.
 */

 import java.util.Scanner;
 
 public class exercicio7{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int premio = 780000;

        int primeiro = (46/100)*premio;
        int segundo = (32/100)*premio;
        int terceiro = primeiro - segundo;

        System.out.println("A quatidade recebida pelo primeiro ganhador foi: " + primeiro);
        System.out.println("A quantidade recebida pelo segundo ganhador foi: " + segundo);
        System.out.println("A quantidade recebida pelo terceiro ganhador foi: " + terceiro);
        
        entrada.close();

    }
 }