package estacionamento.Pagamento;
public class PagamentoDinheiro extends Pagamento{
    @Override
    protected void formaPagamento() {
        System.out.println("Pagamento no dinheiro, Aprovado");
    }    
}
