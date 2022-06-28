package banco;

public class Cobradores implements SaqueEmDinheiro, ConsultaDeSaldo {
    @Override
    public void consultarSaldo() {
        System.out.println("Saldo consultado");
    }

    @Override
    public void sacar() {
        System.out.println("Saque realizado");

    }
}
