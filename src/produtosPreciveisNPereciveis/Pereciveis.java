package produtosPreciveisNPereciveis;

public class Pereciveis extends Produto {
    int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco, null);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double getPreco() {
        if (diasParaVencer == 1){
            return preco / 4;
        }
        if (diasParaVencer == 2){
            return preco / 3;
        }
        if (diasParaVencer == 3){
            return preco / 2;
        }
        return preco;
    }


    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                ", preco=" + getPreco() +
                ", nome=" + nome +
                '}';
    }
}
