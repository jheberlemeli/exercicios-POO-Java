package excecoes;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            int divisao = b / a;

        }catch (ArithmeticException exception){
            System.out.println("Ocorreu um erro");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
