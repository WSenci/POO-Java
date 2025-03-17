package semana02;

public class Senha {
	
	public static void main(String[] args) {
		String senha = "";
		final int LIMITE = 10;
		
		for(int c=1; c<=10; c++) {
			int n = (int)(Math.random()*LIMITE);
			senha += n;
		}
		System.out.println(senha);
	}

}
