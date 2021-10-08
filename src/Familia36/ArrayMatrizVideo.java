package Familia36;

import java.util.Scanner;

public class ArrayMatrizVideo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = new int[3][3];
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Matriz M[3][3] \n");
		
		for(int linha = 0; linha < 3; linha++)
		{
			for(int coluna = 0; coluna < 3; coluna++)
			{
				System.out.printf("Insira o elemento M[%d][%d]: ", linha + 1, coluna + 1);
				matriz[linha][coluna] = leia.nextInt();
				
			}
		}
		
		System.out.println("\nA Matriz ficou: ");
		
		for(int linha = 0; linha < 3; linha++)
		{
			for(int coluna = 0; coluna < 3; coluna++)
			{
				System.out.printf("\t %d \t", matriz[linha][coluna]);
			}
			System.out.println();
		}
		

	}

}
