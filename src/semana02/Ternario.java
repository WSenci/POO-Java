package semana02;

public class Ternario {
	
	public static void main(String[] args) {
		int a = 10, b = 10;
		
		//Utilizando ternário
		int maior = a>b?a:b>a?b:a;
		System.out.println(maior);
		
		String s = a>b?""+a:b>a?""+b:"Iguais.";
		System.out.println(s);
		
		//Utilizando IF		
		if(a>b) {
			System.out.println(a);
		}
		else if(b>a) {
			System.out.println(b);
		}
		else {
			System.out.println("Iguais.");
		}
	}

}
