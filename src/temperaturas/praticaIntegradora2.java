package temperaturas;

public class praticaIntegradora2 {

    public static void main(String[] args) {

        Participante thiago = new Participante(11111, "thiago", "silva", 17, 77777, 77777, "O", "Circuito Pequeno" );
        Participante felipe = new Participante(11111, "felipe", "silva", 20, 77777, 77777, "O", "Circuito Medio" );
        Participante julia = new Participante(11111, "julia", "silva", 19, 77777, 77777, "O", "Circuito Grande");

        julia.inscrever();
        thiago.inscrever();
        felipe.inscrever();
        Integer valorPago = felipe.pagamentoCircuito();

        System.out.println(valorPago);
        System.out.println(julia);
        System.out.println(felipe.numeroDeInscricao);



        }

    }
