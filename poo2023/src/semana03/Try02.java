package semana03;

import javax.swing.JOptionPane;

public class Try02 {
	
	public static void main(String[] args) {
		
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
			int media = 100/idade;
			JOptionPane.showInputDialog(null, "Deu certo! Idade: " + idade + "Media: " + media);
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Deu pau: " + e);
		}
		catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "A idade não pode ser zero: " + e);
		}
		
	}

}
