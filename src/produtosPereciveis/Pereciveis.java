package produtosPereciveis;

public class Pereciveis extends Produto{
    int diasParaVencer;

    public Pereciveis(int diasParaVencer) {
        super();
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }

    public void calcular(int quantidadeDeProdutos){
        double valorFinal = getPreco() * quantidadeDeProdutos;
        if (diasParaVencer == 1){
            double novoPreco = getPreco() / 4;
        }
        if (diasParaVencer == 2){
            double novoPreco = getPreco() / 3;
        }
        if (diasParaVencer == 3){
            double novoPreco = getPreco() / 2;
        }
    }
}
