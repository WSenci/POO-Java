package semana02;

public class Math01 {
	
	public static void main(String[] args) {
		
		int a=10, b=20, c=30;
		System.out.println(Math.max(a, Math.max(b, c)));
		int maior = Math.max(a, Math.max(b, c));
		int menor = Math.min(a, Math.max(b, c));
		System.out.println(maior);
		System.out.println(menor);
		
	}

}
