public class Juros {
    private double juros;

    public double calcularJuros(int meses){
        return meses * this.juros;
    }

    public double valorJuros(double juros) {
        return  this.juros = juros/100;
    }
}
