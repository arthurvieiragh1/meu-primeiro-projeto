public class Intem {
    public Produto produto;
    public TabelaDePreco preco;
    public Double quantidade;
    public Double total;

    @Override
    public String toString() {
        return "Intem{" +
                "produto=" + produto +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", total=" + total +
                '}';
    }
}
