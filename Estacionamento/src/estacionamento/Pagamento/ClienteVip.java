package estacionamento.Pagamento;
public class ClienteVip implements EstadoEstacionamento{

    @Override
    public void vazio() {
        System.out.println("Estacionamento vazio!");
    }

    @Override
    public void lotado() {
        System.out.println("Estacionamento lotado, dirija-se para area dos clientes Vips");
    }
    
}
