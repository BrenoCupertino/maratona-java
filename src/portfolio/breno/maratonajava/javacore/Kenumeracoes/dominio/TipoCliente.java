package portfolio.breno.maratonajava.javacore.Kenumeracoes.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALOR;
    public final String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente getClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public int getValor() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
