package Familia36;

public class Operario extends Pessoa{
		
	private double valorProducao;
	private double comissao;
	
	// construtores
	public Operario(String nome, String endereco, String cpf, int telefone, int idade, double valorProducao, double comissao)
	{
		super(nome, endereco, cpf, telefone, idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Operario: " + getNome() + "\nCPF: " + getCpf ()
				+ "\nIdade: " + getIdade() 
				+ "\nTelefone: " + getTelefone() 
				+ "\nEndereco: " + getEndereco()
				+ "\nValor monetario total dos artigos produzidos: " + valorProducao
				+ "\nPorcentagem (sem %) da comissao deste artigo: " + comissao);
	}
	
	public void calcularValorArtigo() 
	{
		double valorTotal = valorProducao + (valorProducao * (comissao/100));
		System.out.println("\nO valor total a ser recebido pelo operario: " + getNome()
		+ " e igual ha: " + valorTotal);
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
}
