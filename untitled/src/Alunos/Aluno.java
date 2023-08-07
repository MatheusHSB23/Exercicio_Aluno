package Alunos;

public class Aluno {
    private final String ra;
    private final String nome;
    private final double notaProva1;
    private final double notaProva2;
    private final double notaTrabalho;

    public Aluno(String ra, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.ra = ra;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public double media() {
        return (notaProva1 * 3.5 + notaProva2 * 3.5 + notaTrabalho * 3) / 10;
    }

    public String situacao() {
        double mediaFinal = media();
        return mediaFinal >= 7.0 ? "APROVADO" : "EXAME";
    }

    public String getFormattedMedia() {
        return String.format("%.1f ", media());
    }

    @Override
    public String toString() {
        return "|  R.A: " + ra + "      | Nome: " + nome;
    }
}