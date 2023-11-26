class BoloFesta extends Bolo {
    private String decoracao;


    public BoloFesta(String sabor, int preco, int andares, String decoracao,String nome) {
        super(sabor, preco,andares,nome);
        this.decoracao = "Nenhuma, Batman, Homem-aranha, Flash";
        this.sabor = "Morango, Creme";
    }

    public void adicionarDecoracao(String decoracao)  {               //metodo para adicionar decoraçao
        this.decoracao = decoracao;
    }
    public void escolhaDoSabor(String sabor) {
        this.sabor = sabor;                                            //metodo para escolha do sabor do bolo
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Decoração: " + decoracao);



    }
}
