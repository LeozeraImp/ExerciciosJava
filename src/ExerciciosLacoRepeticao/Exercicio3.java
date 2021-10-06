package ExerciciosLacoRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade, menos = 0, mais = 0;
		
		System.out.println("Quando quiser encerrar o programa digite uma idade -99.");
		
		System.out.println("Qual a sua idade: ");
		idade = leia.nextInt();
		
		while(idade != -99) 
		{
			if(idade >= 0 && idade <21)
			{
				menos++;
			}
			
			else if(idade > 50 && idade <= 150)
			{
				mais++;
			}
			
			System.out.println("Qual a sua idade: ");
			idade = leia.nextInt();
		}
		
		System.out.printf("\nVoce tem um total de %d idades com menos de 21 e %d acima de 50 anos", menos, mais);
		
		
		

	}

}
