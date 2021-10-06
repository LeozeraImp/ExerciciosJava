package Familia36;

import java.util.Scanner;

public class VideoIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int idade;
		String nome;
		
		System.out.printf("Entre com sua idade: ");
		idade = leia.nextInt();
		leia.nextLine();
		System.out.printf("Entre com o seu nome: ");
		nome = leia.nextLine();
		System.out.printf("\nSeu nome: %s", nome);
		System.out.printf("\nSua idade: %d", idade);
		
		if (idade >= 18)
		{
			System.out.printf("\nVoce e maior de idade...");
		}
		else if (idade >=1 && idade < 18)
		{
			System.out.printf("\nVoce e menor de idade...");
		}
		else
		{
			System.out.printf("\nVoce entrou com uma idade invalida!!");
		}
		
		
		

	}

}
