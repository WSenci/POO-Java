package semana03;

public class SenhaAleatoria {
	
	public static void main(String[] args) {
		String c = "0123456789ABCDEabcde!@#$%+[]";
		int tamanho = c.length();
		String senha = "";
		int qtde = 6;
		for(int i=0; i<qtde; i++) {
			int indice = (int)(Math.random()*tamanho);
			senha += c.charAt(indice);
			//System.out.println(senha);
		}
		System.out.println(senha);
	}

}
