package ExerciciosPOO;

public class Preguica extends Animal{
	
	private String tamanhoUnha;
	
	public Preguica(String nome, String som, String tamanhoUnha, int idade)
	{
		super(nome, som, idade);
		this.tamanhoUnha = tamanhoUnha;
	}

	public String getTamanhoUnha() {
		return tamanhoUnha;
	}

	public void setTamanhoUnha(String tamanhoUnha) {
		this.tamanhoUnha = tamanhoUnha;
	}
	
	
}
