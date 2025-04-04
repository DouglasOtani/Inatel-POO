import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente_1 = new Cliente ("Chris", 999999999-99);
        MemoriaUSB[] musb = new MemoriaUSB[3];
        musb[0] = new MemoriaUSB();
        musb[1] = new MemoriaUSB();
        musb[2] = new MemoriaUSB();
        Computador[] computadores = new Computador[4];
        computadores[1] = new Computador();
        computadores[2] = new Computador();
        computadores[3] = new Computador();

        musb[0].nome = "Pen-drive";
        musb[0].capacidade = 16;
        musb[1].nome = "Pen-drive";
        musb[1].capacidade = 32;
        musb[2].nome = "HD Externo";
        musb[2].capacidade = 1;

        computadores[1].marca = "Apple";
        computadores[1].preco = 466;
        computadores[1].hardware_basico[0].nome = "Pentium Core i3";
        computadores[1].hardware_basico[0].capacidade = 2200;
        computadores[1].hardware_basico[1].nome = "Memória RAM";
        computadores[1].hardware_basico[1].capacidade = 8;
        computadores[1].hardware_basico[2].nome = "HD";
        computadores[1].hardware_basico[2].capacidade = 500;
        computadores[1].sistema_operacional.nome = "Linux Ubuntu";
        computadores[1].sistema_operacional.tipo = 32;
        computadores[1].addMemoriaUSB(musb[0]);

        computadores[2].marca = "Samsung";
        computadores[2].preco = 1700;
        computadores[2].hardware_basico[0].nome = "Pentium Core i5";
        computadores[2].hardware_basico[0].capacidade = 3370;
        computadores[2].hardware_basico[1].nome = "Memória RAM";
        computadores[2].hardware_basico[1].capacidade = 16;
        computadores[2].hardware_basico[2].nome = "HD";
        computadores[2].hardware_basico[2].capacidade = 1;
        computadores[2].sistema_operacional.nome = "Windows 8";
        computadores[2].sistema_operacional.tipo = 64;
        computadores[2].addMemoriaUSB(musb[1]);

        computadores[3].marca = "Dell";
        computadores[3].preco = 6144;
        computadores[3].hardware_basico[0].nome = "Pentium Core i7";
        computadores[3].hardware_basico[0].capacidade = 4500;
        computadores[3].hardware_basico[1].nome = "Memória RAM";
        computadores[3].hardware_basico[1].capacidade = 32;
        computadores[3].hardware_basico[2].nome = "HD";
        computadores[3].hardware_basico[2].capacidade = 2;
        computadores[3].sistema_operacional.nome = "Windows 10";
        computadores[3].sistema_operacional.tipo = 64;
        computadores[3].addMemoriaUSB(musb[2]);

        int sistema = 4;
        int ver_promocoes = 5;
        int pc_escolhido = 0;
        int tecla_digitada = 0;
        float total_compra = 0;
        int itens_no_carrinho = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("BEM-VINDO AO PCMANIA");
        System.out.println();
        System.out.println("ONDE VOCÊ PODE ENCONTRAR O COMPUTADOR DOS SEUS SONHOS PELO MELHOR PREÇO DO MERCADO!");
        System.out.println();
        System.out.println("TEMOS ALGUMAS PROMOÇÕES PARA VOCÊ");

        while(sistema == 4)
        {

            System.out.println("---------------------Digite---------------------");
            System.out.println("0 - Para sair do programa. ---------------------");
            System.out.println("1 - Para adicionar a promoção 1 no carrinho. ---");
            System.out.println("2 - Para adicionar a promoção 2 no carrinho. ---");
            System.out.println("3 - Para adicionar a promoção 3 no carrinho. ---");
            System.out.println("4 - Para reniciar o sistema. -------------------");
            System.out.println("5 - Para mostrar a lista de promoções. ---------");
            System.out.println("6 - Para finalizar sua compra. -----------------");
            System.out.println("Você pode adicionar até 5 itens no seu carrinho");
            System.out.print("Você tem " + itens_no_carrinho);
            System.out.println(" itens no carrinho");

            tecla_digitada = scanner.nextInt();

            if (tecla_digitada > 0 && tecla_digitada < 4){
                pc_escolhido = tecla_digitada;
            }

            switch (tecla_digitada) {

                case 0:
                    System.out.println("O PROGRAMA SERÁ ENCERRADO");
                    System.out.println();
                    System.out.println("OBRIGADO POR PASSAR NA NOSSA LOJA!");
                    sistema = 0;
                    break;
                case 1:
                case 2:
                    for (int i = 0; i < cliente_1.carrinho.length; i++) {
                        if (cliente_1.carrinho[i] == null) {
                            cliente_1.carrinho[i] = computadores[pc_escolhido];
                            System.out.println("Item adicionado no carrinho com sucesso!");
                            itens_no_carrinho++;
                            break;
                        }
                    }
                    if (itens_no_carrinho == cliente_1.carrinho.length){
                        System.out.println("Carrinho esta lotado.");
                    }
                    System.out.println();
                    System.out.println("Digite 4 para voltar ao menu");
                    do {
                        tecla_digitada = scanner.nextInt();
                    } while(tecla_digitada != 4);
                    break;
                case 3:
                    for (int i = 0; i < cliente_1.carrinho.length; i++) {
                        if (cliente_1.carrinho[i] == null) {
                            cliente_1.carrinho[i] = computadores[pc_escolhido];
                            System.out.println("Item adicionado no carrinho com sucesso!");
                            itens_no_carrinho++;
                            break;
                        }
                    }
                    if (itens_no_carrinho == cliente_1.carrinho.length){
                        System.out.println("Carrinho esta lotado.");
                    }
                    System.out.println();
                    System.out.println("Digite 4 para voltar ao menu");
                    do {
                        tecla_digitada = scanner.nextInt();
                    } while(tecla_digitada != 4);
                    break;
                case 4:
                    sistema = tecla_digitada;
                    break;
                case 5:
                    System.out.println("---------------------------------------------");
                    System.out.println("Promoção 1:");
                    System.out.println("Marca: Apple");
                    System.out.println("Preço: R$466,00");
                    System.out.println("Pentium Core i3 (2200 Mhz)");
                    System.out.println("8 Gb de Memoria RAM");
                    System.out.println("500Gb de HD");
                    System.out.println("Sistema Operacional Linux Ubuntu (32 bits)");
                    System.out.println("Acompanha Pen-drive de 16Gb");
                    System.out.println("---------------------------------------------");

                    System.out.println("---------------------------------------------");
                    System.out.println("Promoção 2:");
                    System.out.println("Marca: Samsung");
                    System.out.println("Preço: R$1.700,00");
                    System.out.println("Pentium Core i5 (3370 Mhz)");
                    System.out.println("16 Gb de Memoria RAM");
                    System.out.println("1Tb de HD");
                    System.out.println("Sistema Operacional Windows 8 (64 bits)");
                    System.out.println("Acompanha Pen-drive de 32Gb");
                    System.out.println("---------------------------------------------");

                    System.out.println("---------------------------------------------");
                    System.out.println("Promoção 3:");
                    System.out.println("Marca: Dell");
                    System.out.println("Preço: R$6.144,00");
                    System.out.println("Pentium Core i7 (4500 Mhz)");
                    System.out.println("32 Gb de Memoria RAM");
                    System.out.println("2Tb de HD");
                    System.out.println("Sistema Operacional Windows 10 (64 bits)");
                    System.out.println("Acompanha Pen-drive de 1Tb");
                    System.out.println("---------------------------------------------");
                    System.out.println();
                    System.out.println("Digite 4 para voltar ao menu");
                    do {
                        tecla_digitada = scanner.nextInt();
                    } while(tecla_digitada != 4);
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Finalizando _|¨¨|__|¨¨|__|¨¨|__|¨¨|__|¨¨|__|¨¨|_");
                    System.out.println();
                    System.out.println("Finalizado! Muito obrigado pela sua compra. Em alguns dias chegará na sua casa, não fique ansioso!");
                    System.out.println();
                    System.out.println("Nome: " + cliente_1.nome);
                    System.out.println("CPF: " + cliente_1.cpf);
                    System.out.println("Informações da sua compra:");
                    System.out.println("======================================================");
                    for (int i = 0; i < cliente_1.carrinho.length; i++) {
                        if(cliente_1.carrinho[i] != null) {
                            System.out.println("======================================================");
                            cliente_1.carrinho[i].mostraPCConfigs();
                            System.out.println("-----------------------------------------");
                        }
                    }
                    System.out.println("==============================================");
                    total_compra = cliente_1.calculaTotalCompra();
                    System.out.printf("Total da compra: R$%.2f " , total_compra);
                    sistema = 0;
                    break;

                default:
                    System.out.println("Ops! Algo deu errado... Tente reniciar o programa");
            }
        }
    }
}