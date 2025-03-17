package semana03;

import javax.swing.JOptionPane;

public class Lista3 {
	
	public static void main(String[] args) {
		//Elabore uma aplicação que efetue a leitura de 10 valores numéricos e 
		//apresente no final o total do somatório e a média dos valores lidos
		
		float n = 0, m = 0, media = 0;
		
		for(int i=1; i<=10; i++) {
			n = Float.parseFloat(JOptionPane.showInputDialog("Digite o " + i + "º número: "));
			m+=n;
			
		}
		
		media=m/10;

		JOptionPane.showMessageDialog(null, "A média é: " + media);
		
	}

}
