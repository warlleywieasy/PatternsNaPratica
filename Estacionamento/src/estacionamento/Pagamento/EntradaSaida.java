package estacionamento.Pagamento;

import java.util.ArrayList;
import java.util.List;

public class EntradaSaida {
    private int carro;
    private List<Observador> observadores = new ArrayList();
    private void notificar(){
        for(Observador observador: observadores){
            observador.notificar();
        }
    }
    public void setVagas(int carro){
        this.carro = carro;
        notificar();
    }
    public void addObservador(Observador observador){
        this.observadores.add(observador);
    }
        
}