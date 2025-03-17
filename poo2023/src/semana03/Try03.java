package semana03;

import javax.swing.JOptionPane;

public class Try03 {
	
	public static void main(String[] args) {
		
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
			int media = 100/idade;
			JOptionPane.showInputDialog(null, "Deu certo! Idade: " + idade + "Media: " + media);
		}
		catch(Exception e) {
			if(e.toString().indexOf("Number")>=0) {
				JOptionPane.showMessageDialog(null, "Valor inválido!");
			}
			else if(e.toString().indexOf("Arith")>=0) {
				JOptionPane.showMessageDialog(null, "Não pode ser zero!");
			}
			JOptionPane.showMessageDialog(null, "Deu pau: " + e);
		}
		
	}

}
