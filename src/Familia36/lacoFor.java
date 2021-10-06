package Familia36;

import java.util.Scanner;

public class lacoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, nota2, nota3, media, mediageral, somamedia = 0;
		int x;
		
		Scanner leia = new Scanner (System.in);
		
		for(x = 1; x <= 4; x++)
		{
			System.out.println("Entre com a primeira nota: ");
			nota1 = leia.nextFloat();
			System.out.println("Entre com a segunda nota: ");
			nota2 = leia.nextFloat();
			System.out.println("Entre com a terceira nota: ");
			nota3 = leia.nextFloat();
			
			media = (nota1 + nota2 + nota3) / 3;
			System.out.printf("\nMedia do alune %d: %2.2f",x , media);
			
			somamedia = somamedia + media;
		}
		
		mediageral = somamedia / 4;
		System.out.println("\nMedia geral: " + mediageral);
		
		
				

	}

}
