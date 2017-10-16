
package estacionamento.Pagamento;

public class PagamentoCartaoDebito extends Pagamento{
    @Override
    protected void formaPagamento() {
        System.out.println("Pagamento no Cartao de DEBITO, Aprovado");
    }    
}
