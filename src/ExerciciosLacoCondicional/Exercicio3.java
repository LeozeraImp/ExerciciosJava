package ExerciciosLacoCondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.println("Qual o seu nome: ");
		nome = leia.nextLine();
		System.out.println("Qual a sua idade: ");
		idade = leia.nextInt();
		
		if (idade < 10)
		{
			System.out.println("Ola, " + nome + "Voce tem " + idade + "anos de idade, se encaixa na nossa turma do maternal, seja muito bem vindo(a)" );
		}
		else if(idade >= 10 && idade <= 14)
		{
			System.out.println("Ola, " + nome + "Voce tem " + idade + "anos de idade, se encaixa na nossa turma do infantil, seja muito bem vindo(a)" );
		}
		else if(idade >= 15 && idade <= 17)
		{
			System.out.println("Ola, " + nome + "Voce tem " + idade + "anos de idade, se encaixa na nossa turma do juvenil, seja muito bem vindo(a)" );
		}
		else
		{
			System.out.println("Ola, " + nome + "Voce tem " + idade + "anos de idade, se encaixa na nossa turma do adultos, seja muito bem vindo(a)" );
		}
		
	}

}
