package Familia36;

import java.util.Scanner;

public class IfElseExemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tMenu de opcaoes...");
		System.out.println("\n1 - Voce e muito gentil...");
		System.out.println("\n2 - Voce e muito persistente...");
		System.out.println("\n3 - Voce e muito resiliente...");
		System.out.println("\n4 - Voce e muito dedicado(a)...");
		System.out.println("\nDigite um opcao: ");
		opcao = leia.nextInt();
		
		
		switch (opcao)
		{
		case 1:
			System.out.println("\nVoce e muito gentil...");
			break;
		
		case 2:
			System.out.println("\nVoce e muito persistente...");
			break;
		
		case 3:
			System.out.println("\nVoce e muito resiliente...");
			break;
			
		case 4:
			System.out.println("\nVoce e muito dedicado(a)...");
			break;
		
			default:
				System.out.println("\nOpcao Invalida!!!");
		}

	}

}
