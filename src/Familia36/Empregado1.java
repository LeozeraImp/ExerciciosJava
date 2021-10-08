package Familia36;

public class Empregado1 extends Pessoa{
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
		 // construtores
	public Empregado1(String nome, String endereco, String cpf, int telefone, int idade, int codigoSetor, float salarioBase, float imposto)
	{
		super(nome, endereco, cpf, telefone, idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	 // metodos
	public void imprimirInfo()
	{
		System.out.println("\nNome do Empregado: " + getNome() + "\nCPF: " + getCpf ()
				+ "\nIdade: " + getIdade() 
				+ "\nTelefone: " + getTelefone() 
				+ "\nEndereco: " + getEndereco()
				+ "\nCodigo do Setor: " + codigoSetor
				+ "\nSalario Base : " + salarioBase 
				+ "\nValor em porcentagem(sem%) de imposto a ser retido do salario: " + imposto);
	}
	
	public void  calcularSalario()
	{
		double salarioTotal = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nO salario total a receber pelo empregador: " + getNome()
		+ "e igual a : " + salarioTotal);
	}
	 //gets & sets
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	

}
