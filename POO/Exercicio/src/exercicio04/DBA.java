package exercicio04;

public class DBA extends Funcionario{

    @Override
    public void bonus(){
        this.setSalario(this.getSalario() + (this.getSalario() * 3)/100);
    }
}
