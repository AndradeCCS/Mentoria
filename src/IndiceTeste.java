import java.util.ArrayList;
import java.util.List;

public class IndiceTeste {
    public static void main(String[] args) {
        List<Double> indices = new ArrayList<>();
        indices.add(1.32165487);
        indices.add(4.12324569);
        System.out.println("Indice Inicial: " + indices.get(0) + " Indice Final: " + indices.get(1));
        System.out.println("---------------------------");

        CalculoIndice calculoIndice = new CalculoIndice();
        System.out.println(calculoIndice.calcularIndice(new Indice(1.32165487, 4.12324569)));


    }

}
