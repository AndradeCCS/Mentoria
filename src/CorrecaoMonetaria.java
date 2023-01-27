public class CorrecaoMonetaria {
    private Indice indice;
    private CalculoIndice calculoIndice;
    private ValorObjeto valorObjeto;

    public void calcularCorrecaoMonetaria(){

    }
    public Double calcularCorrecaoMonetaria(Double respCI, Double respO) {
        Double resp = respCI * respO + respO;
        return resp;
    }
}
