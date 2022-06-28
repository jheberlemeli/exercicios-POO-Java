package banco;

public class Basicos implements ConsultaDeSaldo, PagamentoDeServicos, SaqueEmDinheiro{
    public void consultarSaldo() {
        System.out.println("Saldo consultado");
    }

    @Override
    public void pagarServicos() {
        System.out.println("Serviços pagos");
    }

    @Override
    public void sacar() {
        System.out.println("Saque realizado");

    }
}
