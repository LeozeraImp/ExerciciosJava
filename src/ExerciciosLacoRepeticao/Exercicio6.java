package ExerciciosLacoRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0, contador = 0;
		float media;
		
		do 
		{
			System.out.println("Quando quiser sair do programa, basta digitar 0.");
			System.out.println("\nInsira um numero: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0)
			{
				soma += numero;
				
				contador++;
			}
			
		}while (numero != 0);
		
			media = soma / contador;
			System.out.printf("A media dos multiplos de 3 e de: %.2f ", media);

		
	

	}

}
