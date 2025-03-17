package semana03;

import javax.swing.JOptionPane;

public class Lista6 {
	
	public static void main(String[] args) {
		//Elabore uma aplicação que gere uma senha numérica de n dígitos (solicitado ao 
		//usuário), ou seja, a aplicação solicita a quantidade de dígitos e o programa 
		//apresenta a senha em tela
		
		String c = "0123456789";
		int tamanho = c.length();
		String senha = "";
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantos dígitos terá a senha?"));;
		for(int i=0; i<qtde; i++) {
			int indice = (int)(Math.random()*tamanho);
			senha += c.charAt(indice);
			//System.out.println(senha);
		}
		System.out.println(senha);
	}

}
