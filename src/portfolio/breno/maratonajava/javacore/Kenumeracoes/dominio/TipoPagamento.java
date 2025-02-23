package portfolio.breno.maratonajava.javacore.Kenumeracoes.dominio;

public enum TipoPagamento {
    //Podemos ter comportamentos diferentes para metodos dependendo das enumerações.

    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    // Utilizamos "abstract" quando o metodo não é executado e sim suas sobrecargas.
    public abstract double calcularDesconto(double valor);
}