package estacionamento.Pagamento;
public class PainelPropaganda implements Observador{

    @Override
    public void notificar() {
        System.out.println("Painel de Propagandas foi notificado com entrada/saida de um Veiculo");
    }
    
}