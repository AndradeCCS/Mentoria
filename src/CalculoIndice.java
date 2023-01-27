public class CalculoIndice {
    private double indice;
        public double calcularIndice (Indice indice){
        return this.indice = indice.getIndiceFinal()/ indice.getIndiceInicial() -1;
    }

}
