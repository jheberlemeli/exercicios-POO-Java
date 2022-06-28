package banco;

public class Executivos implements Deposito, Transferencia {


    @Override
    public void depositar() {
        System.out.println("Depósito realizado");
    }

    @Override
    public void transferir() {
        System.out.println("Transferencia realizada");
    }
}
