package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		String nome;
		float nota1, nota2, nota3, media;
		int peso1 = 2, peso2 = 3, peso3 = 5;
		
		System.out.println("Insira o nome do aluno: ");
		nome = leia.nextLine();
				
		System.out.println("Qual a sua primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Qual a sua segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Qual a sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = ( (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) ) / (peso1 + peso2 + peso3);
		
		System.out.println("A media do seu aluno e: " + media);
		
		
		
		

	}

}
