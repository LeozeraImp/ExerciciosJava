package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String args[])
	{
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idadeDias, diaAtual, mesAtual, anoAtual, calculoIdade, calculoMes, calculoDia, calculoAno, restoAno, restoMes;
		
		
		diaAtual = 01;
		mesAtual = 10;
		anoAtual = 2021;
		
		System.out.println("Qual o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Escreva sua idade em dias: \n");
		idadeDias = leia.nextInt();
		
		calculoAno = idadeDias / 365;
		
		restoAno = idadeDias % 365;
		
		calculoMes = restoAno / 30;
		
		restoMes = restoAno % 30;
		
		System.out.printf("Ola " + nome + "\nSua Idade e: " + calculoAno + " ano(s), " + calculoMes + " mes(es), " + restoMes + " dia(s)." );
				
		
		
		
	}
	

}
