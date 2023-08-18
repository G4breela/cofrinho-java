public class euro extends moeda {
    public euro(double valor) {
        super(valor, "Eurozona");
    }

    @Override
    public double converterParaReal() {
        return valor * 5.41; // Taxa de conversão simulada: 1 Euro = 5 Reais
    }
}
