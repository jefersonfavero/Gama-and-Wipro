package exercicio03;

public class Retangulo implements FormaGeometrica{

    private String cor;

    public Retangulo(){
    }

    public Retangulo(String cor){
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
        return a*b;
    }

}
