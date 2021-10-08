package ExerciciosPOO;

public class Cavalo extends Animal{
	
	private String tipodeCor;
	
	public Cavalo(String nome, String som, String tipodeCor, int idade)
	{
		super(nome, som, idade);
		this.tipodeCor = tipodeCor;
	}

	public String getTipodeCor() {
		return tipodeCor;
	}

	public void setTipodeCor(String tipodeCor) 
	{
		this.tipodeCor = tipodeCor;
	}
	
	

}
