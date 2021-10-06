package Familia36;

import java.util.Scanner;

public class IfElseExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a Segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
				
		media = (nota1 + nota2 + nota3) / 3;
		System.out.printf("\nMedia: %2.2f", media);
		
		if (media >= 7 && media <+10 )
		{
			System.out.println("\nAlune Aprovade!!!");
		}
		else if(media >= 5 && media < 7)
		{
			System.out.println("\nAlune de exame!!!");
		}
		else
		{
			System.out.println("\nAlune Reprovade");
		}

	}

}
