package portfolio.breno.maratonajava.javacore.Kenumeracoes.test;

import portfolio.breno.maratonajava.javacore.Kenumeracoes.dominio.Cliente;
import portfolio.breno.maratonajava.javacore.Kenumeracoes.dominio.TipoCliente;
import portfolio.breno.maratonajava.javacore.Kenumeracoes.dominio.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente("Breno", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente c2 = new Cliente("Adv. Carlos", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO );

        System.out.println(c);
        System.out.println(c2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(150));

        TipoCliente tipoCliente = TipoCliente.getClientePorNomeRelatorio("Pessoa fisica");
        System.out.println(tipoCliente);
    }
}
