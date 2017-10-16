package estacionamento.Pagamento;
public class CancelaLiberada implements AcaoCancela{ 
    @Override
    public void comportamento() {
        System.out.println("Pagamento Aprovado, Catraca Liberada, Volte Sempre!");
    }    
}
