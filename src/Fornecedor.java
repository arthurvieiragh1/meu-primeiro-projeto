public class Fornecedor {
    public String nome;
    public String cpfCnpj;
    public String email;
    public Integer ddd;
    public Long numeroCelular;
    public String tabelaDePreco;

    @Override
    public String toString() {
        return "Fornecedor{" +
                "nome='" + nome + '\'' +
                ", cpfCnpj='" + cpfCnpj + '\'' +
                ", email='" + email + '\'' +
                ", ddd=" + ddd +
                ", numeroCelular=" + numeroCelular +
                ", tabelaDePreco='" + tabelaDePreco + '\'' +
                '}';
    }
}
