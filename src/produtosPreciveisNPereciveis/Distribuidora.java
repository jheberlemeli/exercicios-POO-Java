package produtosPreciveisNPereciveis;

public class Distribuidora {
    public static void main(String[] args) {
        Produto mamao1 = new Pereciveis("mamao", 2.0,2);
        Produto mamao2 = new Pereciveis("mamao", 2.0, 1);
        Produto mamao3 = new Pereciveis("mamao", 2.0, 2);
        Produto mamao4 = new Pereciveis("mamao", 2.0, 3);

        Produto arroz = new NaoPereciveis("arroz", 3.0, "3");

        Produto[] produtosComprados = {mamao1,mamao2,mamao3,mamao4};

        imprimeNotaFiscal(produtosComprados);

    }

    private static void imprimeNotaFiscal(Produto[] produtos) {
        double valorTotal = 0.0;
        for (Produto p:produtos){
            valorTotal += p.getPreco();
            System.out.println(p);

        }
        System.out.println("valorTotal " + valorTotal);

    }
}
