package exercicio02;

public class Main {

    public static void main(String[] args) {

        AlunoMatriculado am = new AlunoMatriculado(1, "Fulano", 7, 7, 8);
        AlunoMatriculado outroAm = new AlunoMatriculado(2, "Sicrano", 5, 4, 3);

        System.out.format("\nO aluno %s tem média %.1f e tem %.1f para recuperação.", am.getNome(), am.media(), am.recuperacao(am));
        System.out.format("\nO aluno %s tem média %.1f e tem %.1f para recuperação.\n", outroAm.getNome(), outroAm.media(), outroAm.recuperacao(outroAm));

    }
}