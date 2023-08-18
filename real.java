public class real extends moeda {
    public real(double valor) {
        super(valor, "Brasil");
    }

    @Override
    public double converterParaReal() {
        return valor;
    }
}
