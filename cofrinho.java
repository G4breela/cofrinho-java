import java.util.ArrayList;
import java.util.List;

public class cofrinho {
    private List<moeda> moedas;

    public cofrinho() {
        moedas = new ArrayList<>();
    }

    public void adicionarMoeda(moeda moeda) {
        moedas.add(moeda);
    }

    public void removerMoeda(int index) {
        moedas.remove(index);
    }

    public void listarMoedas() {
        for (int i = 0; i < moedas.size(); i++) {
            System.out.println((i + 1) + ". " + moedas.get(i).valor + " " + moedas.get(i).pais);
        }
    }

    public double calcularTotalEmReal() {
        double total = 0.0;
        for (moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }

    public List<moeda> getMoedas() {
        return moedas;
    }
}

