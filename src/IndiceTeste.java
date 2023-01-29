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
        System.out.println("Coeficiente do Índice: " + respCI);
        System.out.println("---------------------------");

        ValorObjeto objeto = new ValorObjeto();
        Double respO = objeto.objetoInicial(200);
        System.out.println("Valor do Objeto: " + respO);
        System.out.println("---------------------------");

        CorrecaoMonetaria cm = new CorrecaoMonetaria();
        Double respCM = cm.calcularCorrecaoMonetaria(respCI, respO);
        System.out.println("Objeto Com Correção Monetária: " + respCM);

        System.out.println("---------------------------");
        Juros juros = new Juros();
        juros.valorJuros(2.5);
        double respJ = juros.calcularJuros(10);
        System.out.println("Percentual de Juros: " +respJ);

        System.out.println("---------------------------");
        double respJ2 = cm.calcularJuros(respCI, respO, respJ);
        System.out.println("uros do Objeto Corrigido: " + respJ2);

        System.out.println("---------------------------");
        double respJCM = cm.calcularJurosCM(respCI, respO, respJ);
        System.out.println("Valor do Objeto Corrigido com juros: " + respJCM);
    }

}
