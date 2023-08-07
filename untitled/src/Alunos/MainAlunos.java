package Alunos;

import java.util.Scanner;

public class MainAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o R.A. do aluno: ");
        String ra = scanner.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        double notaProva1, notaProva2, notaTrabalho;
        do {
            System.out.print("Nota da prova 1(0 a 10): ");
            notaProva1 = scanner.nextDouble();
        } while (notaProva1 < 0 || notaProva1 > 10);

        do {
            System.out.print("Nota da prova 2(0 a 10): ");
            notaProva2 = scanner.nextDouble();
        } while (notaProva2 < 0 || notaProva2 > 10);

        do {
            System.out.print("Nota do trabalho(0 a 10): ");
            notaTrabalho = scanner.nextDouble();
        } while (notaTrabalho < 0 || notaTrabalho > 10);

        System.out.println();

        Aluno aluno = new Aluno(ra, nome, notaProva1, notaProva2, notaTrabalho);

        System.out.println("+-------------------------------+");
        System.out.println("|       >>> RESULTADO <<<       |");
        System.out.println("+-------------------------------+");
        System.out.println(aluno);
        System.out.println("|  Média: " + aluno.getFormattedMedia());
        System.out.println("|  Situação: " + aluno.situacao());
        System.out.println("+-------------------------------+");

    }
}