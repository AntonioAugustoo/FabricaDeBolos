public abstract class Bolo implements Produto {
    protected String sabor;
    protected int preco;
    protected int andares;
    protected String nome;

    private static final double PrecoPorAndar = 10.0;            //preço fixo por andar


    public Bolo(String sabor, int preco, int andares,String nome) {
        this.sabor = sabor;
        this.preco = preco;
        this.andares = andares;
        this.nome = nome;

    }

    @Override
    public double calcularPreco() {
        return preco + (PrecoPorAndar * andares);                            //metodo de calculo do preço de acordo com o tamanho do bolo

    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: "+nome);
        System.out.println("Sabor: " + sabor);
        System.out.println("Preço: R$" + calcularPreco());                         //mostra infos dos bolos
        System.out.println("Número de Andares: " + andares);
    }


}
