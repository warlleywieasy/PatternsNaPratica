package estacionamento.Pagamento;

public class ValidacaoPagamento implements AcaoCancela {

    @Override
    public void comportamento() {
        System.out.println("Verificando forma de Pagamento");
        if (true) {
            CancelaLiberada livre = new CancelaLiberada();
            livre.comportamento();
        } else {
            System.out.println("Catraca fechada, sua forma de pagamento nao e "
                    + "valida, tente outra forma de pagamento");
        }
    }

}
