public class PedidoCompra {
    public Fornecedor fornecedor;
    public String intens;
    public Double totalReal;
    public Double totalQuantidade;

    @Override
    public String toString() {
        return "PedidoCompra{" +
                "fornecedor=" + fornecedor +
                ", intens='" + intens + '\'' +
                ", totalReal=" + totalReal +
                ", totalQuantidade=" + totalQuantidade +
                '}';
    }
}
