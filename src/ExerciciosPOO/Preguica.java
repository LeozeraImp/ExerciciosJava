package ExerciciosPOO;

public class Preguica extends Animal{
	
	private String tamanhoUnha;
	
	public Preguica()
	{
		super("Preguica");
	}
	
	
	@Override
	 public void emitirSom()
	 {
		System.out.println("O som que esse animal emite e um bocejo");
	 }
	@Override
	public void tipoDeMovimento()
	{
		System.out.println("Esse animal se move subindo nas arvores com suas garras");
	}

	public String getTamanhoUnha() {
		return tamanhoUnha;
	}

	public void setTamanhoUnha(String tamanhoUnha) {
		this.tamanhoUnha = tamanhoUnha;
	}
	
	
}
