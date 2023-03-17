public class Hamburguer {
    public String nome;
    public double valor;
    public boolean seEAtesanal;

    public double CalcularValor(boolean seEAtesanal) {
        if (seEAtesanal) {
            return valor + 8.00;

        }
        return valor;

    }
    public String ConsultarNome (){
        return nome;
    }
}
