package semana03;

import javax.swing.JOptionPane;

public class Lista2 {
	
	public static void main(String[] args) {
		//média de 3 numeros positivos
		
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Número 1: "));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Número 2: "));
		float n3 = Float.parseFloat(JOptionPane.showInputDialog("Número 3: "));
		float media = 0;
		if(n1>=0 && n2>=0 && n3>=0) {
			media = (n1+n2+n3)/3;
			JOptionPane.showMessageDialog(null, "Média: " + media);
		}
		else {
			JOptionPane.showMessageDialog(null, "A média não pode ser calculada.");
			
		}
	}

}
