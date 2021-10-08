package POOVideo;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// iniciando atributos
		CarroVideo meuCarro = new CarroVideo();
		meuCarro.cor = "Vermelho";
		meuCarro.modelo = "Passat";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		// metodos
		
		meuCarro.liga();
		
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		meuCarro.pegaMarcha();
	}

}
