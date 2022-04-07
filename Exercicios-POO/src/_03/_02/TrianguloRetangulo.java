package _03._02;

public class TrianguloRetangulo implements FormaGeometrica{

    private String cor;

    public TrianguloRetangulo (){

    }

    public TrianguloRetangulo (String cor){
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
        return "3";
    }

    @Override
    public double area(double a, double b) {
        return (a*b)/2;
    }

}
