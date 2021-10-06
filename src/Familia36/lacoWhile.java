package Familia36;

import java.util.Scanner;

public class lacoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, somaNumero = 0, contador = 0;
		float mediaNumero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva com um numero: ");
		numero = leia.nextInt();
		
		while(numero != 0)
		{
			somaNumero += numero;
			contador++;
			
			System.out.println("\nEntre com um proximo numero: ");
			numero = leia.nextInt();
		}
		
		if(contador == 0) 
		{
			System.out.println("\nNao existe divisao por ZERO!!!!");
		}
		
		else
		{
			mediaNumero = somaNumero / contador;
			System.out.printf("\nMedia dos numeros: %.2f", mediaNumero);

		}
		
	}

}
