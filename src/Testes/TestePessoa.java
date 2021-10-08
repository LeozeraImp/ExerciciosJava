package Testes;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa Jessica = new Pessoa("Jessica", 555);
		
		Funcionario Pedro = new Funcionario ("Pedro", 222,"TI");
		
		Pessoa Maria = new Funcionario ("Maria", 333,"Informatica--Desenvolvimento");
		
		Pessoa Jose = new Coordenador ("Jose", 444, "CC");
		
		System.out.println("Matricula da Jessica e: "+ Jessica.getMatricula());
		System.out.println(Pedro.getDepartamento());
		System.out.println(Maria.getMatricula());
		System.out.println(Jose.getNome());




	}

}
