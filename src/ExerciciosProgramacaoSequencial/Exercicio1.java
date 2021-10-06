package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int diaAtual, mesAtual, anoAtual, diaNascimento, mesNascimento, anoNascimento, calculoAno, calculoMes, calculoDia, calculoIdade;
		
		diaAtual = 01;
		mesAtual = 10;
		anoAtual = 2021;
		
		//System.out.printf("Real = %.10f", real);
		
		  System.out.println("Qual o seu nome: ");
		  nome = leia.nextLine();
		  
		  System.out.println("Qual sua data de nascimento: \n");
		  System.out.println("Insira o ano em que nasceu: ");
		  anoNascimento = leia.nextInt();
		  System.out.println("Insira o mes em que nasceu: ");
		  mesNascimento = leia.nextInt();
		  System.out.println("Insira o dia em que nasceu: ");
		  diaNascimento = leia.nextInt();
		  
		  calculoAno = (anoAtual - anoNascimento) * 365;
		  
		  calculoMes = (mesAtual - mesNascimento) * 30;
		  
		  calculoDia = (diaAtual - diaNascimento);
		  
		  calculoIdade = calculoAno + calculoMes + calculoDia;
		  
		  System.out.println("Sua idade e de: " + calculoIdade + " dias");
				  
		  
		  
		  
		  
		  
		 
		 
		
		
			

	}

}
