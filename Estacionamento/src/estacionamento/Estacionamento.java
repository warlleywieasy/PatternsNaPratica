package estacionamento;
import estacionamento.Pagamento.ClienteVip;
import estacionamento.Pagamento.Pagamento;
import estacionamento.Pagamento.PagamentoCartaoCredito;
import estacionamento.Pagamento.PagamentoDinheiro;
import estacionamento.Pagamento.PainelPropaganda;
import estacionamento.Pagamento.EntradaSaida;
import estacionamento.Pagamento.Pessoa;
public class Estacionamento {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();  
        Pagamento pg1 = new PagamentoDinheiro();      
        p1.vazio();
        EntradaSaida v1 = new EntradaSaida();
        pg1.recepcao();
        v1.addObservador(new PainelPropaganda());
        v1.setVagas(1);        
        System.out.println("====================================================");        
        Pessoa p2 = new Pessoa();  
        Pagamento pg2 = new PagamentoCartaoCredito();
        p2.setEstado(new ClienteVip());
        EntradaSaida v2 = new EntradaSaida();
        p2.lotado();
        pg2.recepcao();
        v2.addObservador(new PainelPropaganda());
        v2.setVagas(1);        
        System.out.println("====================================================");        
        Pessoa p3 = new Pessoa();  
        p3.lotado();       
        System.out.println("====================================================");        
    }    
}