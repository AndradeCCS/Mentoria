public class CorrecaoMonetaria {
    private Indice indice;
    private CalculoIndice calculoIndice;
    private ValorObjeto valorObjeto;
    private Juros juros;

    public Double calcularCorrecaoMonetaria(Double respCI, Double respO) {
            return  respCI * respO + respO;
        }
    public Double calcularJuros(Double respCI, Double respO, double juros) {
        return (respO * respCI + respO)*juros;
    }

    public Double calcularJurosCM(Double respCI, Double respO, double juros) {
        return (respO * respCI + respO)*juros + calcularCorrecaoMonetaria(respCI, respO);
    }



}
