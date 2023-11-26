public class Comprador {
    private String nome;
    private int saldo;
    private static Arquivo arquivo;

    public Comprador(String nome, int saldo) {
        this.nome = nome;
        this.saldo = saldo;

    }
    public void BancoDeDados(){
        arquivo.escrever("-----------Comprador----------");
        arquivo.escrever("Nome: " + this.nome);
        arquivo.escrever("Saldo: " + this.saldo);
    }

    public void realizarCompra(Bolo bolo) {
        // Verifica se o comprador tem saldo suficiente para a compra
        if (saldo >= bolo.calcularPreco()) {
            System.out.println(nome + " realizou a compra do seguinte bolo:");
            bolo.exibirDetalhes();


            // Deduz o preço do saldo do comprador
            saldo -= bolo.calcularPreco();

        } else {
            System.out.println(nome + " não possui saldo suficiente para realizar a compra.");
        }

    }
    public void Saldoatual()
    {
        System.out.println("Novo saldo de " + this.nome + ": R$" + this.saldo);
    }



    public static void SetArq(String nomedoArquivo){
     arquivo = new Arquivo(nomedoArquivo);

    }

    public void mostraInfos() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Saldo: "+this.saldo);

    }
}


