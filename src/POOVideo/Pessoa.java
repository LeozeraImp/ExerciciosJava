package POOVideo;
// classe
public class Pessoa {
		// atributos
	private String primeiroNome;
	private String nomesdoMeio;
	private String ultimoNome;
	
	// Criar construtor
	
	public Pessoa (String primeiro, String meio, String ultimo) // parametros
	{
		// atributos
		primeiroNome = primeiro; 
		nomesdoMeio = meio;
		ultimoNome = ultimo;
	}
	
	// metodo get
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome + " " + nomesdoMeio + " " + ultimoNome;
		return nomeCompleto;
	}
}
