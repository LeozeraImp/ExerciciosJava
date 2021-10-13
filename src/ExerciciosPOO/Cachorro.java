package ExerciciosPOO; 

public class Cachorro extends Animal{
	
	private String raca ;
	
	public Cachorro() 
	{
		super("Cachorro");
	}

	@Override
	 public void emitirSom()
	 {
		System.out.println("O som que esse animal emite e um latido");
	 }
	@Override
	public void tipoDeMovimento()
	{
		System.out.println("Esse animal se move correndo em 4 patas");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	}

	
	
	

