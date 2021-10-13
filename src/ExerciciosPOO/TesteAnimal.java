package ExerciciosPOO;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo ();
		Preguica preguica = new Preguica ();
		Animal animal = null;
		
		Scanner leia = new Scanner(System.in);
		
		int opcaoAnimal, opcaoRaca, opcaoCor, opcaoUnha ;
		
		System.out.println("\t\tSelecione um animal: \n"
				+ "[0] --> Cachorro\n"
				+ "[1] --> Cavalo\n"
				+ "[2] --> Preguica");
		opcaoAnimal = leia.nextInt();
	
	if(opcaoAnimal == 0)
	{
		cachorro.emitirSom();
		cachorro.tipoDeMovimento();
		
	}
	else if (opcaoAnimal == 1)
	{
		cavalo.emitirSom();
		cavalo.tipoDeMovimento();
	}
	else if (opcaoAnimal == 2)
	{
		preguica.emitirSom();
		preguica.tipoDeMovimento();
	}
	else
	{
		System.out.println("\nOpcao Invalida!!! Digite novamente!");
	}
	}
}
