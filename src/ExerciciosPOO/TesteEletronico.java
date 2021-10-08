package ExerciciosPOO;

import java.util.Scanner;

public class TesteEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eletronico eletronico1 = new Eletronico("Playstation 5", 4300);
		
		Eletronico eletronico2 = new Eletronico ("Iphone 12", 6000);
		
		Scanner leia = new Scanner(System.in);
		
		int opcaoPagamento;
		
		System.out.println("O pagamento sera feito a vista?\n[1] - Sim\n[2] - Nao ");
		opcaoPagamento = leia.nextInt();
		
		if(opcaoPagamento == 1)
		{
			eletronico1.PrecoAVista(eletronico1.getPreco());
			eletronico2.PrecoAVista(eletronico2.getPreco());
		}
		
		System.out.println(eletronico1.getNome() + "\nPreco: R$" + eletronico1.preco);
		System.out.println(eletronico2.getNome() + "\nPreco: R$" + eletronico2.preco);
		
		

	}

}
