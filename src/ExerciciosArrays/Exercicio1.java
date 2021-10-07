package ExerciciosArrays;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Vetor denominado A que tenha 6 numeros inteiros. Deve seguir os seguintes passo:
		// a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
		// b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
		// c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
		// d) Mostre na tela cada valor do vetor A, um em cada linha.
		
		int [] arrayUm = {1, 0, 5, -2, -5, 7}; // a
		int soma = 0;
		
		for(int x = 0; x < arrayUm.length; x++)
		{
			if(x == 0 || x == 1 || x == 5)
			{
				soma += arrayUm[x];
			}
		}
		
		System.out.printf("\nA soma entre a posicao 0, 1 e 5 e de: %d", soma); // b
		
		soma = arrayUm[0] + arrayUm[1] + arrayUm[5];
		
		System.out.printf("\nA soma entre a posicao 0, 1 e 5 e de: %d", soma); // b
		
		arrayUm[4] = 100; // c
		
		/*
		 * System.out.println("\nO vetor fica: " + arrayUm[0]);
		 * System.out.println("O vetor fica: " + arrayUm[1]);
		 * System.out.println("O vetor fica: " + arrayUm[2]);
		 * System.out.println("O vetor fica: " + arrayUm[3]);
		 * System.out.println("O vetor fica: " + arrayUm[4]);
		 * System.out.println("O vetor fica: " + arrayUm[5]);
		 */
		
		for(int x = 0; x < arrayUm.length; x++)
		{
			System.out.printf("\nPosicao[%d]: %d", x, arrayUm[x]); //d
		}
	}

}
