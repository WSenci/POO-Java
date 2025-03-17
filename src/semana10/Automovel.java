package semana10;

public class Automovel implements Motor, Porta{

	public void ligar() {
		System.out.println("Ligando o automovel");
	}
	public void desligar() {
		System.out.println("Desligando o automovel");
	}
	public void acelerar() {
		System.out.println("Acelerando o automovel");
	}
	public void frear() {
		System.out.println("Freando o automovel");
	}
	@Override
	public void abrir() {
		System.out.println("Abrindo a porta do automovel");
	}
	@Override
	public void fechar() {
		System.out.println("Fechando a porta do automovel");
	}

}
