package aula5;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class ClasseExecutavel {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double[] notaAluno = new double[50];
		double[] nota2Aluno = new double[50];
		String[] aluno = new String[20];
		double somaNotas = 0;
		int maximoAluno = 10;

		for (int cont = 0; cont < maximoAluno; cont++) {

			System.out.println("Digite Nome Do  Aluno: " + (cont + 1));

			aluno[cont] = new Scanner(System.in).next();

			System.out.println("Digite  Notas Bimestrais Do Aluno(A): " + (cont + 1));
			notaAluno[cont] = new Scanner(System.in).nextDouble();
			nota2Aluno[cont] = new Scanner(System.in).nextDouble();
			somaNotas = notaAluno[cont] + nota2Aluno[cont];

			System.out.println("Soma Das Notas Do Aluno(A): " + "[" + somaNotas + "]" + " Pontos\n");
			System.out.println("<<<<<*****<><><><><>*****<><><><><>*****>>>>>");
			if (somaNotas >= 7) {
				System.out.println(ANSI_YELLOW+ "O ALUNO(A): " + aluno[cont]
						+ " >>> ESTÁ APROVADO(A)\n<PARABÉNS, ESPERO QUE VOCÊ CONTINUE ASSIM!>"+ANSI_RESET);
				System.out.println("<<<<<*****<><><><><>*****<><><><><>*****>>>>>\n");
			} else {
				System.out.println(ANSI_YELLOW+"ALUNO(A): " + aluno[cont]
						+ " >>> REPROVADO: \nNÃO DESISTA , RECOMECE DE CABEÇA ERGUIDA E VOCÊ PODE CONSEGUIR SER APROVADO(A)\n"+ANSI_RESET);
			} 
		}

	}

}
