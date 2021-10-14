package ExerciciosPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int opcao;
	
	Scanner leia = new Scanner(System.in);
	
	ArrayList<String> estoque = new ArrayList();
	
	do 
	{
		System.out.println("<--------Controle de estoque---------->");
		System.out.println("\n[1] Adicione um novo item ao seu estoque.");
		System.out.println("\n[2] Remova um item da sua lista de estoque.");
		System.out.println("\n[3] Atualize um item da sua lista de estoque.");
		System.out.println("\n[4] Verificar todos os itens do seu estoque.");
		System.out.println("\n[0] Fechar o programa.");
		System.out.println("\n--------------------------------------------");
		System.out.println("\nDigite sua opcao: ");
		opcao = leia.nextInt();
		
		switch(opcao)
		{
		case 1:
			leia.nextLine();
			System.out.println("\nDigite ao produto para adicionar ao estoque: ");
			String produto = leia.nextLine();
			estoque.add(produto);
			break;
		case 2:
			leia.nextLine();
			System.out.println("\nDigite qual produto para remover do estoque: ");
			String produtor = leia.nextLine();
			if(estoque.contains(produtor))
			{
				estoque.remove(produtor);
			}
			else
			{
				System.out.println("\nProduto nao existe no estoque!!");
			}
			break;
		case 3:
			leia.nextLine();
			System.out.println("\nDigite o produto que quer atualizar: ");
			String verifica = leia.nextLine();
			System.out.println("\nDigite o nome do produto que entrara no lugar do " + verifica + ":" );
			String novo = leia.nextLine();
			if(estoque.contains(verifica))
			{
				estoque.remove(verifica);
				estoque.add(novo);
			}
			else
			{
				System.out.println("\nProduto nao existente no estoque!!!");
			}
			break;
		case 4:
			leia.nextLine();
			System.out.println("\nProdutos do estoque: ");
			System.out.println(estoque);
			break;
			default:
				System.out.println("Finalizou o programa!!!");
		}
	}while(opcao != 0);
		
	
	}

}
