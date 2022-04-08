import java.util.Scanner;

public class Compra {

    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);

        int[]    idProduto       =   {1,2,3,4,5,6,7,8,9,10};
        String[] nomeProduto     =   {"Leite","Cereal","Arroz","Atum","Feijão","Azeite","Óleo","Sabão","Sal","Açucar"};
        int[]    quantProduto    =   {10,10,10,10,10,10,10,10,10,10};
        double[] valorProduto    =   {10,3.02,9.43,3.55,6.55,4.55,7.33,1.99,3.82,4.29};

        double taxa                  = 10;
        double modificadorMastercard = 20;
        double modificadorAVista     = 10;
        double modificadorParcelado  = 0;

        System.out.print("\nSistema Iniciado!!!\nDeseja realizar uma compra? [S/N]:");
        String continuarCompra = ler.next();
        while(!continuarCompra.equalsIgnoreCase("s") && !continuarCompra.equalsIgnoreCase("n")){
            System.out.print("Comando inválido!!!\nDeseja realizar uma compra? [S/N]:");
            continuarCompra = ler.next();
        }

        while(continuarCompra.equalsIgnoreCase("s")){
            //na primeira posicao vai guardar o id e na segunda a quantidade
            int[][] produtosNoCarrinho            = new int[10][2];
            double valorTotalCompra               = 0.0;
            double valorTotalCompraComModificador = 0.0;
            double valorTotalCompraComTaxa        = 0.0;

            do{
                System.out.println("\n======================================================");
                System.out.println("Código  \tProduto  \tQuant. Produto  \tPreço Un");

                for(int i = 0; i < idProduto.length; i++){
                    System.out.format("%d \t \t \t%s \t \t%d \t \t \t \t \t%.2f\n", idProduto[i], nomeProduto[i], quantProduto[i], valorProduto[i]);
                }
                System.out.println("======================================================");

                System.out.print("\nDigite o código do produto: ");
                int idDigitado = ler.nextInt();

                while(!(idDigitado <= idProduto.length) || !(idDigitado > 0)){
                        System.out.print("\nCódigo inválido!!!\nDigite o código do produto: ");
                        idDigitado = ler.nextInt();
                }

                System.out.print("Digite a quantidade do produto: ");
                int quantidadeDigitada = ler.nextInt();

                if(quantProduto[idDigitado-1] == 0){
                    System.out.println("\nDesculpe, este produdo acabou!");
                }else if(quantProduto[idDigitado-1] - quantidadeDigitada >= 0){
                    System.out.println("\n" + quantidadeDigitada + " un. de "+ nomeProduto[idDigitado-1] + " adicionado ao carrinho!");
                    quantProduto[idDigitado-1] = quantProduto[idDigitado-1] - quantidadeDigitada;
                    produtosNoCarrinho[idDigitado-1][0] = idDigitado-1;
                    produtosNoCarrinho[idDigitado-1][1] = produtosNoCarrinho[idDigitado-1][1] + quantidadeDigitada;
                }else if(quantProduto[idDigitado-1] - quantidadeDigitada < 0){
                    System.out.println("\nDesculpe, não temos esta quantidade de " + nomeProduto[idDigitado-1] + " em estoque!");
                }

                System.out.print("\nDeseja continuar compra? [S/N]:");

                continuarCompra = ler.next();

                while(!continuarCompra.equalsIgnoreCase("s") && !continuarCompra.equalsIgnoreCase("n")){
                    System.out.print("Comando inválido!!!\nDeseja realizar uma compra? [S/N]:");
                    continuarCompra = ler.next();
                }
            }while(!continuarCompra.equalsIgnoreCase("n"));
            continuarCompra = "s";

            System.out.println("\n============================================================");
            System.out.println("Produto  \tQuantidade \tPreço Un. (R$)  \tPreço Total (R$)");
            for(int i = 0; i < produtosNoCarrinho.length; i++){
                if(produtosNoCarrinho[i][1] > 0){
                    System.out.format("%s \t \t \t%d \t \t%.2f \t \t \t \t%.2f\n", nomeProduto[produtosNoCarrinho[i][0]], produtosNoCarrinho[i][1], valorProduto[produtosNoCarrinho[i][0]], (valorProduto[produtosNoCarrinho[i][0]] * produtosNoCarrinho[i][1]));
                    valorTotalCompra = valorTotalCompra + (valorProduto[produtosNoCarrinho[i][0]] * produtosNoCarrinho[i][1]);
                }
            }
            System.out.println("============================================================");
            System.out.format("\nValor total da compra: %.2f", valorTotalCompra);
            System.out.println("\n============================================================");

            boolean validador = true;
            do{
                System.out.print("\nOpções de pagamento..." +
                        "\n[1]À vista em dinheiro, pix ou cartão MASTERCARD, Desconto: " + modificadorMastercard + "%" +
                        "\n[2]À vista no cartão de crédito. Desconto: " + modificadorAVista + "%" +
                        "\n[3]Em até 3x. Desconto: " + modificadorParcelado + "%" +
                        "\n\nForma de pagamento:");

                String formaPagamento = ler.next();

                switch (formaPagamento){
                    case "1":
                        valorTotalCompraComModificador = valorTotalCompra - (valorTotalCompra * modificadorMastercard)/100;
                        validador = false;
                        break;
                    case "2":
                        valorTotalCompraComModificador = valorTotalCompra - (valorTotalCompra * modificadorAVista)/100;
                        validador = false;
                        break;
                    case "3":
                        valorTotalCompraComModificador = valorTotalCompra;
                        validador = false;
                        break;
                    default:
                        System.out.println("\nOpção inválida!");
                        break;
                }
            }while (validador);

            valorTotalCompraComTaxa = valorTotalCompraComModificador + (valorTotalCompraComModificador * taxa)/100;
            
            System.out.println("=======================Nota Fiscal========================");
            System.out.println("Produto  \tQuantidade \tPreço Un. (R$)  \tPreço Total (R$)");
            for(int i = 0; i < produtosNoCarrinho.length; i++){
                if(produtosNoCarrinho[i][1] > 0){
                    System.out.format("%s \t \t%d \t \t \t%.2f \t \t \t \t%.2f\n", nomeProduto[produtosNoCarrinho[i][0]], produtosNoCarrinho[i][1], valorProduto[produtosNoCarrinho[i][0]], (valorProduto[produtosNoCarrinho[i][0]] * produtosNoCarrinho[i][1]));
                    //System.out.print(nomeProduto[produtosNoCarrinho[i][0]] + " \t \t" + produtosNoCarrinho[i][1] + " \t \t \t" + valorProduto[produtosNoCarrinho[i][0]] + "\t \t \t \t" + (valorProduto[produtosNoCarrinho[i][0]] * produtosNoCarrinho[i][1]) + "\n");
                }
            }
            System.out.println("=============================================================");

            System.out.format("\nValor descontado:  %.2f", (valorTotalCompra * modificadorMastercard)/100);
            System.out.format("\nValor tributário:  %.2f", (valorTotalCompraComModificador*taxa)/100);
            System.out.format("\nValor a pagar:     %.2f", valorTotalCompraComTaxa);

            System.out.print("\n\n\nDeseja realizar uma nova compra? [S/N]:");
            continuarCompra = ler.next();
            while(!continuarCompra.equalsIgnoreCase("s") && !continuarCompra.equalsIgnoreCase("n")){
                System.out.print("Comando inválido!!!\nDeseja realizar uma compra? [S/N]:");
                continuarCompra = ler.next();
            }
        }
        ler.close();
        System.out.println("\n░░░░░░░░░░░░░░░░░░░░░░█████████\n" +
                "░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███\n" +
                "░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███\n" +
                "░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\n" +
                "░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███\n" +
                "░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██\n" +
                "░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\n" +
                "░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██\n" +
                "░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██\n" +
                "██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██\n" +
                "█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██\n" +
                "██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\n" +
                "░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\n" +
                "░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█\n" +
                "░░████████████░░░█████████████████\n");
        System.out.println("\nObrigado e volte sempre!!!");
    }
}