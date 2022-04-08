package exercicio04;

public class Programdor extends Funcionario{

    @Override
    public void bonus(){
        this.setSalario(this.getSalario() + (this.getSalario() * 20)/100);
    }
}
