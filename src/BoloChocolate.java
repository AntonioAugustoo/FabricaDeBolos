public class BoloChocolate extends Bolo {


    public BoloChocolate(String sabor, int preco, int andares,String  nome) {
        super(sabor, preco,andares,nome);
        this.sabor = "Chocolate, Brigadeiro";
    }

    public void escolhaDeSabor(String sabor) {
        this.sabor = sabor;
    }                           //metodo para escolha do sabor do bolo
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();

    }

}
