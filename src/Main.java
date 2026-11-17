//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto papelao = new Produto();
        papelao.descricao = "Papelao";
        System.out.println(papelao);

        TabelaDePreco tabelaDePreco = new TabelaDePreco();
        tabelaDePreco.custo = 1.2;
        tabelaDePreco.produto = papelao;
        System.out.println(tabelaDePreco);

        Produto jhow = new Produto();
        jhow.descricao = "Jhow";

        TabelaDePreco tabelaDePreco1 = new TabelaDePreco();
        tabelaDePreco1.custo = 2.5;
        tabelaDePreco1.produto = jhow;
        System.out.println(tabelaDePreco1);

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.cpfCnpj = "56995949";
        fornecedor.nome = "asa branca";
        fornecedor.email = "asabranca2@gmail.com";
        fornecedor.ddd = 82;
        fornecedor.numeroCelular = 988799557l;
        fornecedor.tabelaDePreco = "papelao = 1.87, ferro = 2.80";
        System.out.println(fornecedor);

        PedidoCompra pedidoCompra = new PedidoCompra();
        pedidoCompra.fornecedor = fornecedor;
        pedidoCompra.intens = "papelao, ferro, aluminio, etc..";
        pedidoCompra.totalReal = 54.45;
        pedidoCompra.totalQuantidade = 97.45;
        System.out.println(pedidoCompra);

    }
}