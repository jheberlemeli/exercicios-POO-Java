package temperaturas;

public class Participante {
    Integer RG;
    String nome;
    String sobrenome;
    Integer idade;
    Integer numero;
    Integer numeroEmergencia;
    String grupoSanguineo;
    String categoria;
    Integer numeroDeInscricao;
    static Integer proximoNumeroDeInscricao = 1;

    public Participante(Integer RG, String nome, String sobrenome, Integer idade, Integer numero, Integer numeroEmergencia, String grupoSanguineo, String categoria) {
        this.RG = RG;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.numero = numero;
        this.numeroEmergencia = numeroEmergencia;
        this.grupoSanguineo = grupoSanguineo;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "RG=" + RG +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", numero=" + numero +
                ", numeroEmergencia=" + numeroEmergencia +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", numeroDeInscricao=" + numeroDeInscricao +
                '}';
    }

    public void inscrever() {
        numeroDeInscricao = proximoNumeroDeInscricao;
        proximoNumeroDeInscricao += 1;
    }

    public int pagamentoCircuito() {
        switch (categoria) {
            case "Circuito Pequeno":
                return idade > 17 ? 1500 : 1300;
            case "Circuito Medio":
                return idade > 17 ? 2300 : 2000;

            case "Circuito Grande":
                if (idade > 17) {
                    return 2800;
                }
        }
        return idade;
    }
}