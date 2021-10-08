package ExerciciosPOO;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Animal cachorro = new Animal ("Cachorro", "Latido", 8);
		Animal cavalo = new Animal ("Cavalo", "Relincha", 10);
		Animal preguica = new Animal ("Preguica", "Boceja", 3);
		
		Scanner leia = new Scanner(System.in);
		
		int opcaoAnimal, opcaoRaca, opcaoCor, opcaoUnha ;
		
		System.out.println("\t\tSelecione um animal: \n"
				+ "[1] --> Cachorro\n"
				+ "[2] --> Cavalo\n"
				+ "[3] --> Preguica");
		opcaoAnimal = leia.nextInt();
	
	if(opcaoAnimal == 1)
	{
		cachorro.ImprimirInfo();
	}
	else if (opcaoAnimal == 2)
	{
		cavalo.ImprimirInfo();
	}
	else if (opcaoAnimal == 3)
	{
		preguica.ImprimirInfo();
	}
	else
	{
		System.out.println("\nOpcao Invalida!!! Digite novamente!");
	}
	}
}
