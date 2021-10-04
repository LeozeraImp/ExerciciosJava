package ExerciciosLacoCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Escreva o primeiro numero: ");
		numero1 = leia.nextInt();
		System.out.println("Escreva o segundo numero: ");
		numero2 = leia.nextInt();
		System.out.println("Escreva o terceiro numero: ");
		numero3 = leia.nextInt();
		
		if (numero1 < numero2 && numero2 < numero3)
		{
			System.out.println("A ordem crescente fica: \n" + numero1 + "\n" + numero2 + "\n" + numero3 );
		}
		else if (numero1 < numero3 && numero3 < numero2)
		{
			System.out.println("A ordem crescente fica: \n" + numero1 + "\n" + numero3 + "\n" + numero2);
		}
		else if (numero2 < numero3 && numero3 < numero1)
		{
			System.out.println("A ordem crescente fica: \n" + numero2 + "\n" + numero3 + "\n" + numero1);
		}
		else if (numero2 < numero1 && numero1 < numero3)
		{
			System.out.println("A ordem crescente fica: \n" + numero2 + "\n" + numero1 + "\n" + numero3);
		}
		else if (numero3 < numero2 && numero2 < numero1)
		{
			System.out.println("A ordem crescente fica: \n" + numero3 + "\n" + numero2 + "\n" + numero1);
		}
		else
		{
			System.out.println("A ordem crescente fica: \n" + numero3 + "\n" + numero1 + "\n" + numero2);
		}

	}

}
