
package estacionamento.Pagamento;
public abstract class  Pagamento {
    public void recepcao(){
        calcularTempo();
        calcularValor();
        formaPagamento();
        validacao();
    }
    public void calcularTempo(){
        System.out.println("Calculando tempo que ficou estacionado..");
    }
    public void calcularValor(){
        System.out.println("Calculando valor a ser pago..");
    }
    protected abstract void formaPagamento();
    
    public void validacao(){
        AcaoCancela a = new ValidacaoPagamento();
        a.comportamento();
    }
}
