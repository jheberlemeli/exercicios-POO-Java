package produtosPereciveis;

public class Distribuidora {
    public static void main(String[] args) {
        Produto mamao = new Pereciveis(3);
        Produto arroz = new NaoPereciveis("1");
        mamao.calcular(3);

        Produto[] produtos = {mamao, arroz};

        valorFinal(produtos);

    }

    private static void valorFinal(Produto[] produtos) {
        double precoProdutos;
        for (Produto n:produtos){
            
        }
    }
}
