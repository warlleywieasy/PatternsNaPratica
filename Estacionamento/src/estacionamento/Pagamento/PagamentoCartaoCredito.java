package estacionamento.Pagamento;

public class PagamentoCartaoCredito extends Pagamento{
   private boolean finalizadora = false;
    @Override
    
    protected void formaPagamento() {        
        System.out.println("Pagamento no Cartao de Credito, nao Confirmado!");
        finalizadora = true;
    }    
}
