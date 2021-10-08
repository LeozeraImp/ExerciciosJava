package ExerciciosPOO;

public class Animal {
	 // atributos
	private String nome;
	private String emitirSom;
	private int idade;
	
	// construtores
	
	public Animal (String nome, String emitirSom, int idade)
	{
		this.nome = nome;
		this.idade = idade;
		this.emitirSom = emitirSom;
	}
	 // metodo
	public void ImprimirInfo()
	{
		System.out.println("\nNome do animal: " + getNome()
							+ "\nO som emitido do animal e: " + getEmitirSom()
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
