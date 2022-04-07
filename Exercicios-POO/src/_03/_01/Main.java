package _03._01;

public class Main {
    public static void main(String[] args){

        Circulo c = new Circulo();
        Retangulo r = new Retangulo();

        double raio = 10, base = 10, altura = 10, pi = 3.14;

        System.out.format("%.2f",c.area(raio, pi));
        System.out.println(c.quantidadeDeLados());

        System.out.println(r.area(base, altura));
        System.out.println(r.quantidadeDeLados());

    }
}
