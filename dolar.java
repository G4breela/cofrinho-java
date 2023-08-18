public class dolar extends moeda {
    public dolar(double valor) {
        super(valor, "Estados Unidos");
    }

    @Override
    public double converterParaReal() {
        return valor * 4.97; // Taxa de conversão simulada: 1 Dólar = 5 Reais
    }
}