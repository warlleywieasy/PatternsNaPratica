package estacionamento.Pagamento;
public class ClienteDiario implements EstadoEstacionamento{

    @Override
    public void vazio() {
        System.out.println("Estacionamento vazio!");
    }

    @Override
    public void lotado() {
        System.out.println("Desculpe o transtorno, estacionamento Lotado");
    }
    
}
