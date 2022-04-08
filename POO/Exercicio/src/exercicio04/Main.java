package exercicio04;

public class Main {

    public static void main(String[] args) {

        Programdor p = new Programdor();
        p.setNome("Fulano");
        p.setCpf("001.001.002.12");
        p.setSalario(5000);

        DBA d = new DBA();
        d.setNome("Sicrano");
        d.setCpf("991.991.002.19");
        d.setSalario(5000);


        System.out.format("\nO %s, antes de receber o bônus: %.2f", p.getNome(), p.getSalario());
        System.out.format("\nO %s, antes de receber o bônus: %.2f\n", d.getNome(), d.getSalario());

        p.bonus();
        d.bonus();

        System.out.format("\nO %s, após receber o bônus: %.2f", p.getNome(), p.getSalario());
        System.out.format("\nO %s, após receber o bônus: %.2f\n", d.getNome(), d.getSalario());


    }
}