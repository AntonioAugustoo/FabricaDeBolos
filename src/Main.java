import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Comprador.SetArq("Banco.txt");

        BoloChocolate boloChocolate = new BoloChocolate("Brigadeiro, Chocolate", 60, 3,"Bolo de Chocolate");
        BoloFesta boloFesta = new BoloFesta("Morango, Creme", 60, 3, "Nenhuma, Batman, Homem-aranha, Flash","Bolo de Festas");
        BoloFrutas boloFrutas = new BoloFrutas("Tropical", 60, 4,"Abacaxi, Morango, Kiwi","Bolo de Frutas");
        BoloCenoura boloCenoura = new BoloCenoura("Cenoura", 60, 1,"Bolo de Cenoura");
        BoloCoco boloCoco = new BoloCoco("Coco", 60, 2,"Bolo de Coco");

        Arquivo arquivo = new Arquivo("Banco.txt");

        Comprador comprador1 = new Comprador("João", 600);
        Comprador comprador2 = new Comprador("Luis",400);






        System.out.println("-------------------------------");
        System.out.println("Detalhes dos Bolos Disponiveis: ");
        System.out.println("-------------------------------");
        boloChocolate.exibirDetalhes();
        System.out.println("-------------------------------");
        boloFesta.exibirDetalhes();
        System.out.println("-------------------------------");                     //mostrando infos
        boloFrutas.exibirDetalhes();
        System.out.println("-------------------------------");
        boloCenoura.exibirDetalhes();
        System.out.println("-------------------------------");
        boloCoco.exibirDetalhes();
        System.out.println("-------------------------------");


        // Realizar compras
        System.out.println("Imprimindo extrato das compras");
        System.out.println("-------------------------------");
        boloChocolate.escolhaDeSabor("Brigadeiro");
        comprador1.realizarCompra(boloChocolate);
        System.out.println("-------------------------------");
        boloFesta.adicionarDecoracao("Batman");
        boloFesta.escolhaDoSabor("Morango");
        comprador1.realizarCompra(boloFesta);
        System.out.println("-------------------------------");
        boloFrutas.escolhaDeSabor("Abacaxi");
        comprador1.realizarCompra(boloFrutas);
        System.out.println("-------------------------------");
        comprador1.Saldoatual();
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");


        System.out.println("Imprimindo extrato das compras do segundo comprador");
        System.out.println("-------------------------------");
        comprador2.realizarCompra(boloCoco);
        System.out.println("-------------------------------");
        boloFesta.adicionarDecoracao("Flash");
        boloFesta.escolhaDoSabor("Creme");
        comprador2.realizarCompra(boloFesta);
        System.out.println("-------------------------------");
        comprador2.realizarCompra(boloCenoura);
        System.out.println("-------------------------------");
        comprador2.Saldoatual();
        System.out.println("-------------------------------");

        comprador1.BancoDeDados();
        comprador2.BancoDeDados();

        System.out.println(arquivo.ler());
        ArrayList<Comprador> compradores = new ArrayList<>();
        compradores = arquivo.ler();
        compradores.forEach(comprador -> {
            comprador.mostraInfos();
        });







    }

    }
