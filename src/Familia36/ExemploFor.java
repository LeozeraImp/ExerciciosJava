package Familia36;

public class ExemploFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, soma = 0;
		
		for (x = 1; x <= 10; x++)
		{
			System.out.printf("\n %d", x);
			
			soma = soma + x;
		}
		
		System.out.printf("\nA soma total e: %d", soma);
	}

}
