package ExerciciosPOO;

public class Cavalo extends Animal{
	
	private String tipodeCor;
	
	public Cavalo()
	{
		super("Cavalo");
	}
	
	@Override
	 public void emitirSom()
	 {
		System.out.println("O som que esse animal emite e um relincho");
	 }
	@Override
	public void tipoDeMovimento()
	{
		System.out.println("Esse animal se move trotando em 4 patas");
	}

	public String getTipodeCor() {
		return tipodeCor;
	}

	public void setTipodeCor(String tipodeCor) 
	{
		this.tipodeCor = tipodeCor;
	}
	
	

}
