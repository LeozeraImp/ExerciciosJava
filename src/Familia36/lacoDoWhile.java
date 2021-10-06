package Familia36;

public class lacoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 50, somaPar = 0, somaImpar = 0;
		
		do
		{
			if(x % 2 == 0)
			{
				somaPar += x;
			}
			else
			{
				somaImpar += x;
			}
			x++;
		}
		
		while(x <= 100);
		
		System.out.println("\nSomatorio dos pares: " + somaPar);
		System.out.println("\nSomatorio dos impares: " + somaImpar);

	}

}
