package exercicio02;

public class AlunoMatriculado {

    private int matricula;
    private String nome;
    private double nota01, nota02, notaTrabalho;

    AlunoMatriculado(){

    }
    AlunoMatriculado(int matricula, String nome, double nota01, double nota02, double notaTrabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.notaTrabalho = notaTrabalho;
    }

    //Media: calcula a média final do aluno (cada prova tem peso 1,5 e o trabalho tem peso 2)
    public double media(){
        return ((this.nota01*1.5)+
                (this.nota02*1.5)+
                (this.notaTrabalho*2))/
                (1.5+1.5+2);
    }

    //Recuperação: calcula se a Media é maior que 7 (retorna zero se ele não for para a recuperação)
    public double recuperacao(AlunoMatriculado al){
        if(al.media() >= 7){
            return 0;
        }else{
            return al.media();
        }
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota01() {
        return this.nota01;
    }

    public void setNota01(double nota01) {
        this.nota01 = nota01;
    }

    public double getNota02() {
        return this.nota02;
    }

    public void setNota02(double nota02) {
        this.nota02 = nota02;
    }

    public double getNotaTrabalho() {
        return this.notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
}
