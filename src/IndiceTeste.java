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
        Double respCI = calculoIndice.calcularIndice(new Indice(46.11947434, 	53.56438479));
        System.out.println(respCI);
        System.out.println("---------------------------");

        ValorObjeto objeto = new ValorObjeto();
        Double respO = objeto.objetoInicial(100);
        System.out.println(respO);
        System.out.println("---------------------------");

        CorrecaoMonetaria cm = new CorrecaoMonetaria();
        Double respCM = cm.calcularCorrecaoMonetaria(respCI, respO);
        System.out.println(respCM);



    }

}
