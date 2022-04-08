package exercicio03;

public class Main {

    public static void main(String[] args) {

        Circulo c = new Circulo("Azul");
        Retangulo r = new Retangulo();
        r.setCor("Amarelo");
        Quadrado q = new Quadrado("Verde");
        TrianguloRetangulo tr = new TrianguloRetangulo("Vermelho");

        System.out.format("Círculo!!! \n\tcor: %s\n\tlados: %s\n\tarea(raio = 10): %s",
                c.cor(),
                c.quantidadeDeLados(),
                c.area(10, 3.14)
        );
        System.out.format("\nRetângulo!!! \n\tcor: %s\n\tlados: %s\n\tarea(base = 11 e altura = 10): %s",
                r.cor(),
                r.quantidadeDeLados(),
                r.area(11, 10)
        );
        System.out.format("\nQuadrado!!! \n\tcor: %s\n\tlados: %s\n\tarea(base e altura = 10): %s",
                q.cor(),
                q.quantidadeDeLados(),
                q.area(10, 10)
        );
        System.out.format("\nQuadrado!!! \n\tcor: %s\n\tlados: %s\n\tarea(base e altura = 10): %s",
                tr.cor(),
                tr.quantidadeDeLados(),
                tr.area(10, 10)
        );
    }
}