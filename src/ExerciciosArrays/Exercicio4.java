package ExerciciosArrays;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float matriz1[][] = new float[2][2];
		float matriz2[][] = new float[2][2];
		float matriz3[][] = new float[2][2];
		int linha, coluna, opcao, numero;
		
		for(linha = 0; linha < 2; linha++)
		{
			for(coluna = 0; coluna < 2; coluna++)
			{
				System.out.println("\nEntre com o valor da matriz 1: ");
				matriz1[linha][coluna] = leia.nextFloat();
				System.out.println("\nEntre com o valor da matriz 1: ");
				matriz2[linha][coluna] = leia.nextFloat();
			}
		}
			System.out.println("\n\t\tMenu de opcaoes");
			System.out.println("\n1 - Somar as duas matrizes");
			System.out.println("\n2 - Subtraia a primeira matriz da segunda");
			System.out.println("\n3 - Adicione uma variavel as duas matrizes");
			System.out.println("\n4 - Imprima as duas matrizes");
			System.out.println("\nDigite sua opcao: ");
			opcao = leia.nextInt();
			while(opcao < 1 || opcao > 4)
			{
				System.out.println("\n\t\tMenu de opcoes");
				System.out.println("\n1 - Somar as duas matrizes");
				System.out.println("\n2 - Subtraia a primeira matriz da segunda");
				System.out.println("\n3 - Adicione uma variavel as duas matrizes");
				System.out.println("\n4 - Imprima as duas matrizes");
				System.out.println("\nDigite sua opcao: ");
				opcao = leia.nextInt();
			}
			do
			{
				switch(opcao)
				{
				case 1:
					
					for(linha = 0; linha < 2; linha++)
					{
						for(coluna = 0; coluna < 2; coluna++)
						{
							matriz3[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
							System.out.printf("\nSoma: %.2f", matriz3[linha][coluna]);
						}
					}
					break;
				case 2:
					
					for(linha = 0; linha < 2; linha++)
					{
						for(coluna = 0; coluna < 2; coluna++)
						{
							matriz3[linha][coluna] = matriz1[linha][coluna] - matriz2[linha][coluna];
							System.out.printf("\nDiferenca: %.2f", matriz3[linha][coluna]);
						}
					}
					break;
				case 3:
					
					System.out.println("\nEntre com um numero: ");
					numero = leia.nextInt();
					for(linha = 0; linha < 2; linha++)
					{
						for(coluna = 0; coluna < 2; coluna++)
						{
							matriz3[linha][coluna] += numero;
							matriz2[linha][coluna] += numero;
							System.out.printf("\nMatriz1: %.2f", matriz1[linha][coluna]);
							System.out.printf("\nMatriz2: %.2f", matriz2[linha][coluna]);
						}
					}
					break;
				case 4: 
					
					for(linha = 0; linha < 2; linha++)
					{
						for(coluna = 0; coluna < 2; coluna++)
						{
							System.out.printf("\nMatriz1: %.2f", matriz1[linha][coluna]);
							System.out.printf("\nMatriz2: %.2f", matriz2[linha][coluna]);
						}
					}
					break;
					default:
						System.out.println("Opcao invalida!");
				}		
				System.out.println("\n\t\tMenu de opcaoes");
				System.out.println("\n1 - Somar as duas matrizes");
				System.out.println("\n2 - Subtraia a primeira matriz da segunda");
				System.out.println("\n3 - Adicione uma variavel as duas matrizes");
				System.out.println("\n4 - Imprima as duas matrizes");
				System.out.println("\nDigite sua opcao: ");
				opcao = leia.nextInt();
						
				
			}while(opcao < 1 || opcao > 4);
			
			
	}
}
