package Familia36;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros [][] = new int [2][3];
		int linha, coluna, contadorPar = 0, contadorImpar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha = 0; linha < 2; linha++)
		{
			for(coluna = 0; coluna < 3; coluna++)
			{
				System.out.println("\nEntre com um numero: ");
				numeros[linha][coluna] = leia.nextInt();
			}
			
		}
		for(linha = 0; linha < 2; linha++)
		{
			for(coluna = 0; coluna < 3; coluna++)
			{
				if(numeros[linha][coluna] % 2 == 0)
				{
					System.out.println("\n" +numeros[linha][coluna] + "<---- Este numero e par");
					contadorPar++;
				}
				else
				{
					System.out.println("\n" +numeros[linha][coluna] + "<---- Este numero e impar");
					contadorImpar++;
				}
			}
			
		}
		System.out.println("\nTemos: " + contadorPar + "numeros pares");
		System.out.println("\nTemos: " + contadorImpar + "numeros impares");
		
		
	}
	

}
