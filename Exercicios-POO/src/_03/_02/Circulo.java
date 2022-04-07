package _03._02;

public class Circulo implements FormaGeometrica{

    private String cor;

    public Circulo (){

    }

    public Circulo (String cor){
        this.cor = cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String cor() {
        return cor;
    }

    @Override
    public String quantidadeDeLados() {
        return "0";
    }

    @Override
    public double area(double a, double b) {
        return (a*a)*b;
    }
}
