package ExerciciosPOO; 

public class Cachorro extends Animal{
	
	private String raca ;
	
	public Cachorro(String nome,int idade, String som, String raca)
	{
		super(nome, som, idade);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	}

	
	
	

