package exercicio01;

import java.util.Scanner;
import java.util.stream.Stream;

public class ControleRemoto {

    public static void main(String[] args) {

        int volumePadrao = 10;
        int canalPadrao = 1;

        Scanner ler = new Scanner(System.in);

        Televisao tv = new Televisao(canalPadrao, volumePadrao);

        while(true){

            System.out.println("\n//Opções do Controle\\\\");
            System.out.println("Volume + : --------(1)");
            System.out.println("Volume - : --------(2)");
            System.out.println("Canal + : ---------(3)");
            System.out.println("Canal - : ---------(4)");
            System.out.println("Escolha Canal : ---(5)");
            System.out.println("Informações : -----(6)\n");

            System.out.print("Escolha a Opção: ");
            String opcao = ler.next();

            switch (opcao){
                case "1":
                    tv.setMaisVolume();
                    break;
                case "2":
                    tv.setMenosVolume();
                    break;
                case "3":
                    tv.setMaisCanal();
                    break;
                case "4":
                    tv.setMenosCanal();
                    break;
                case "5":
                    System.out.print("Número do Canal: ");
                    int novoCanal = ler.nextInt();
                    tv.escolhaCanal(novoCanal);
                    break;
                case "6":
                    System.out.format("\nCanal: %d\nVolume: %d\n",tv.getCanal(), tv.getVolume());
                    break;
                default:
                    break;

            }

        }

    }

}
