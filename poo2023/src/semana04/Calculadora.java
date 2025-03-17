package semana04;

public class Calculadora {
	public static void main(String[] args) {
		imprimir();
		imprimirFrase("Olá mundo!", 5);
		somar(20, 0);
	}
	
	public static void imprimirFrase(String frase, int qtde) {
		for(int i=0; i<qtde; i++) {
			System.out.println(frase);
		}
	}
	
	public static void imprimir() {
		System.out.println("Apostila de POO");
	}
	
	public static void somar(int a, int b) {
		System.out.println(a+b);
	}

}
