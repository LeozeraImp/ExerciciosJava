package ExerciciosLacoCondicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		float numero;
		
		System.out.println("Insira seu numero: ");
		numero = leia.nextInt();
				
		if (numero % 2 == 0 )
		{
			System.out.printf("O numero par e: " + numero);
			numero = (float) Math.sqrt(numero);
			System.out.printf("\nA raiz quadrada e: %2.2f", numero);
		}
		
		else
		{
			System.out.println("O numero impar e: " + numero);
			numero = (float) Math.pow(numero, 2);
			System.out.printf("\nO numero ao quadrado e: %2.2f", numero);
		}
		
	}

}
