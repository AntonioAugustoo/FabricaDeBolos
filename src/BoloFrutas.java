public class BoloFrutas extends Bolo {
    private String tipoFrutas;

    public BoloFrutas(String sabor, int preco,int andares, String tipoFrutas,String nome) {
        super(sabor, preco,andares,nome);
        this.tipoFrutas = "Abacaxi, Morango, Kiwi";
    }

    public void escolhaDeSabor(String sabor) {                            //metodo para escolha do sabor do bolo
        this.sabor = sabor;
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();

    }
}
