package ExerciciosLacoRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, par = 0, impar = 0, numero;
		
		Scanner leia = new Scanner(System.in);
		
		for(x = 0; x < 10; x++)
		{
			System.out.println("\nInsira um numero: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0)
			{
				par++;
			}
			
			else
			{
				impar++;
			}
	
		
		}
		System.out.printf("\nOs numeros pares sao: %d Os numeros impares sao: %d", par, impar);

	}

}
