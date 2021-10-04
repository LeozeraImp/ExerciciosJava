package ExerciciosLacoCondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1, numero2, numero3, maiorNumero = 0;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero: ");
		numero1 = leia.nextInt();
		System.out.println("Insira o segundo numero: ");
		numero2 = leia.nextInt();
		System.out.println("Insira o terceiro numero: ");
		numero3 = leia.nextInt();
		
		if (numero1 > maiorNumero && numero1 > numero2)
		{
			maiorNumero = numero1;
			System.out.println("\nO maior numero e: " + maiorNumero);
		}
		else if (numero2 > numero1 && numero2 > numero3 )
		{
			maiorNumero = numero2;
			System.out.println("\nO maior numero e: " + maiorNumero);
		}
		else
		{
			maiorNumero = numero3;
			System.out.println("\nO maior numero e: " + maiorNumero);
		}

	}

}
