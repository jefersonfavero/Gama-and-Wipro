package _03._02;

public class Quadrado implements FormaGeometrica{

    private String cor;

    public Quadrado (){

    }

    public Quadrado (String cor){
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
        return "4";
    }

    @Override
    public double area(double a, double b) {
        return a*b;
    }

}
