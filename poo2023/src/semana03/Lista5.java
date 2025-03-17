package semana03;

public class Lista5 {
	
	public static void main(String[] args) {
		//Elabore uma aplicação que gere uma senha contendo 10 dígitos alfanuméricos.
		
			String c = "0123456789ABCDEFGHIJKLMNOPQRDTUVWXYZabcdefghijklmnopqrstuvwxyz";
			int tamanho = c.length();
			String senha = "";
			int qtde = 10;
			for(int i=0; i<qtde; i++) {
				int indice = (int)(Math.random()*tamanho);
				senha += c.charAt(indice);
				//System.out.println(senha);
			}
			System.out.println(senha);
	}

}
