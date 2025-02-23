package portfolio.breno.maratonajava.javacore.Kenumeracoes.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipo;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", tipoClienteInt=" + tipo.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
