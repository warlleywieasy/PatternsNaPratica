package estacionamento.Pagamento;
public class Pessoa {
    private EstadoEstacionamento estado;
    public Pessoa(){
        this.estado = new ClienteDiario();
    }
    public void setEstado(EstadoEstacionamento estado){
        this.estado = estado;
    }
    public void vazio(){
        estado.vazio();
    }
    public void lotado(){
        estado.lotado();
    }
    
}