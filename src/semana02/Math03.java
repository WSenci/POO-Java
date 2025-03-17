package semana02;

public class Math03 {
	
	public static void main(String[] args) {
		//simula um dado de 6 lados
		
		final int MINIMO = 1;
		final int MAXIMO = 6;
		
		int n = (int)(Math.random()*MAXIMO) + MINIMO;
		System.out.println(n);
	}

}
