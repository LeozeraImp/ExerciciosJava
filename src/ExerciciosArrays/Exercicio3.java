package ExerciciosArrays;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ler uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui
		
		int [][] matriz = new int [3][3];
		int contador = 0;
		Scanner leia = new Scanner(System.in);
		
		for (int linha = 0; linha < 3; linha++)
		{
			for(int coluna = 0; coluna < 3; coluna++)
			{
				System.out.printf("Insira seu numero na M[%d][%d]: ", linha, coluna);
				matriz[linha][coluna] = leia.nextInt();
				
				if(matriz[linha][coluna] > 10)
				{
					contador++;
				}
			}
			
			
		}
		
		System.out.printf("\nExistem %d numeros maiores que 10.", contador);
		

	}

}
