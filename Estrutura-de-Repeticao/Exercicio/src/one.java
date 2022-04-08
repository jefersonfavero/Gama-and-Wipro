import java.util.Random;
import java.util.Scanner;

public class one {
	public static void main(String[] args) {

        Random gerador = new Random();
        Scanner ler = new Scanner(System.in); 
        int numeroRandom = gerador.nextInt(11);
        
        System.out.println(numeroRandom);
        
        System.out.println("\nAdvinhe o número entre 0 e 10:\n");
        
        System.out.println("\nDigite um núemro:\n");
        int numeroDigitado = ler.nextInt();
        
        int contador=1;
               
        while(true){        	
        	if(numeroRandom==numeroDigitado) {
        		break;
            }
            if(numeroRandom>numeroDigitado) {
            	System.out.println("\nSeu número é menor!");
            }
            if(numeroRandom<numeroDigitado) {
            	System.out.println("\nSeu número é maior!");
            }        	
            contador++;
            System.out.println("\nDigite um núemro:\n");
        	numeroDigitado = ler.nextInt();
        }      
        System.out.println("\nVocê acertou em " + contador + " tentativas.");
    }
}
