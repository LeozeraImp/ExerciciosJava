package ExerciciosPOO;

public abstract class Animal {
	 // atributos
	private String tipo;
	private String nome;
	private String emitirSom;
	private int idade;
	
	abstract public void emitirSom();
	abstract public void tipoDeMovimento();
	// construtores
	
	public Animal (String tipo)
	{
		this.tipo = tipo;
		
	}
	 // metodo
	public void ImprimirInfo()
	{
		System.out.println("\nNome do animal: " + getNome()
							+ "\nIdade do animal: " + getIdade());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

	
}
